package org.example;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static int sumN2(int top) {
        int sum = 0;
        for (int i = 0; i < top; i++) {
            sum += i * 2;
        }
        return sum;
    }

    public static String evenNumbers(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static double getAverage(List<Double> doubles) {
        double sum = 0;
        for (Double d : doubles) {
            sum += d;
        }
        return sum / doubles.size();
    }

    public static List<String> findWordsStartingWithA(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith("a")) {
                result.add(word);
            }
        }
        return result;
    }

    public static int[][] deepCopy(int[][] matrix) {
        int[][] copy = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = matrix[i].clone();
        }
        return copy;
    }
}
