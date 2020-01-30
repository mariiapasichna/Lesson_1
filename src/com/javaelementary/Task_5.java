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
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }
        System.out.println(s);
        return s;
    }
}