package com.javaelementary;

public class Task_6 {

    /*
    6*) Задан 2-мерный массив char и слово. Написать метод который определит есть ли по вертикали или горизонтали это слово.
    Например, в данном случае для слова test метод должен вернуть true:
    a z r g z
    a t e s t
    q v u t r
    6.1*) Массив загрузить из текстового файла
    */

    public static void main(String[] args) {
        Crossword.searchWord("test.txt","test");
    }
}