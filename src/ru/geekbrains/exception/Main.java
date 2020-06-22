package ru.geekbrains.exception;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(array()));

        try {
            calculateArray(array());
        } catch (CustomSizeException sizeException) {
            System.out.println(sizeException.getMessage());
        } catch (CustomParseException parseException) {
            System.out.println(parseException.getMessage());
        } finally {
            System.out.println("Сумма массива: " + calculateArray(array()));
        }

    }

    public static String[][] array() {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        return array;
    }

    private static int calculateArray(String[][] array){
        int sum = 0;

        if (array[0].length != 4 || array[1].length != 4) {
            throw new CustomSizeException(array[0].length + "x" + array[1].length);
        }

        for (int i = 0; i < array[1].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (IllegalArgumentException e) {
                    throw new CustomParseException(" x" + j + " y" + i);
                }
            }
        }
        return sum;
    }
}

