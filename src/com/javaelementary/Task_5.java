package com.javaelementary;

public class Task_5 {

    /*
    5*) Написать метод который убирает лишние пробелы в строке и возвращает строку.
    Убрать начальные, конечные и между словами должно быть не больше 1 пробела.
    */

    public static void main(String[] args) {
        String s = "  Hello     world,    hello   world,    hello    world.      ";
        removeSpaces(s);
    }

    private static String removeSpaces(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = stringBuilder.length() - 1; i > 0; i--) {
            if (stringBuilder.charAt(i) == ' ' && stringBuilder.charAt(i + 1) == ' ') {
                stringBuilder.deleteCharAt(i);
            }
        }
        String s1 = String.valueOf(stringBuilder);
        System.out.println(s1);
        return s1;
    }
}