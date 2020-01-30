package com.javaelementary;

public class Task_4 {

    /*
    4) Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять
    в круглые скобки ()
    */

    public static final int FROM = 1;
    public static final int TO = 30;

    public static void main(String[] args) {
        makeString();
    }

    private static String makeString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = FROM; i <= TO; i++) {
            stringBuilder.append('(').append(i).append(')');
        }
        String s = String.valueOf(stringBuilder);
        System.out.println(s);
        return s;
    }
}