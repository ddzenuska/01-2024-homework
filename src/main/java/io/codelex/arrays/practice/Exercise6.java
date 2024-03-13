package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[10];
        int[] arrCopy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }

        arr[arr.length - 1] = -7;

        System.out.println("Array 1: " + Arrays.toString(arr));
        System.out.println("Array 2: " + Arrays.toString(arrCopy));
    }
}
