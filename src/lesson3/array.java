package lesson3;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int array_size = scanner.nextInt();
        int[] array = new int[array_size];
        System.out.println("Введите елементы масива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];

        }
        System.out.println("Максимальное число " + max);
        int min = array[0];
        for (int i = 1; i <array.length; i++){
            if (array[i] < min) min = array[i];
        }
        System.out.println("Минимальное число " + min);

        int count = 0;
        for (int i= 0; i<array.length;i++){
            if (array[i]==5) count++;

        }
        System.out.println("число 5 вводится " + count+ "  раза");


    }



}

