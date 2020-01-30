package com.javaelementary;

public class Task_2 {

    /*
    2) Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
- если число кратно 3 то вместо него вывести Hello
- если число кратно 5 то вместо него вывести World
- если число кратно и 3 и 5 то вместо него вывести HelloWorld
    */

    public static final int FROM = 1;
    public static final int TO = 100;

    public static void main(String[] args) {
        int number = 0;
        for (int i = FROM; i <= TO; i++) {
            number = i;
            if (number % 3 == 0 && number % 5 != 0) {
                System.out.print("Hello ");
            }
            if (number % 5 == 0 && number % 3 != 0) {
                System.out.print("World ");
            }
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("HelloWorld ");
            }
            if (number % 3 != 0 && number % 5 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}