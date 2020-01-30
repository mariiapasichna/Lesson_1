package com.javaelementary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Crossword {
    public static final int LINES = 3;
    public static final int COLUMNS = 5;

    public static boolean searchWord(String fileCrossword, String word) {
        char[][] crossword = new char[LINES][COLUMNS];
        createArrayFromFile(crossword, fileCrossword);
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (crossword[i][j] == word.charAt(0)) {
                    searchHorizontal(crossword, word, i, j);
                    searchVertical(crossword, word, i, j);
                    if (searchHorizontal(crossword, word, i, j) || searchVertical(crossword, word, i, j)) {
                        System.out.println("Word " + word + " is found");
                        return true;
                    }
                }
            }
        }
        System.out.println("Word " + word + " is not found");
        return false;
    }

    private static boolean searchVertical(char[][] crossword, String word, int i, int j) {
        if (word.length() + i <= LINES) {
            for (int k = 1; k < word.length(); k++) {
                if (word.charAt(k) == crossword[i + k][j]) {
                    if (k == word.length() - 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean searchHorizontal(char[][] crossword, String word, int i, int j) {
        if (word.length() + j <= COLUMNS) {
            for (int k = 1; k < word.length(); k++) {
                if (word.charAt(k) == crossword[i][j + k]) {
                    if (k == word.length() - 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static char[][] createArrayFromFile(char[][] crossword, String fileCrossword) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileCrossword))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                currentLine = currentLine.trim();
                int k = 0;
                for (int i = 0; i < LINES; i++) {
                    for (int j = 0; j < COLUMNS; j++) {
                        crossword[i][j] = currentLine.charAt(k);
                        k++;
                        if (k > currentLine.length()) {
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < LINES; i++) {
            System.out.println(Arrays.toString(crossword[i]));
        }
        return crossword;
    }
}