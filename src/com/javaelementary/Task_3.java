package com.javaelementary;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {

    /*
    3) Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
    Вывести среднее арифметическое.
    */

    public static final int FROM = 10;
    public static final int TO = 20;
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        createArrayAndInit(arr);
        calculateAverage(arr);
    }

    private static void calculateAverage(int[] arr) {
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double average = sum / arr.length;
        System.out.println("Average = " + average);
    }

    private static void createArrayAndInit(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(TO-FROM+1) + FROM;
        }
        System.out.println(Arrays.toString(arr));
    }
}