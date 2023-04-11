package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Stanislav Zeman
 */
public class Solution {
    public static int sumN2(int top) {
        return IntStream.range(1, top)
            .map(i -> i * 2)
            .sum();
    }

    public static String evenNumbers(int top) {
       return IntStream.range(0, top + 1)
           .filter(i -> i % 2 == 0)
           .mapToObj(Integer::toString)
           .collect(Collectors.joining());
    }

    public static double getAverage(List<Double> doubles) {
        return doubles.stream()
            .mapToDouble(d -> d)
            .average()
            .orElse(0.0);
    }

    public static List<String> findWordsStartingWithA(List<String> words) {
        return words.stream()
            .filter(word -> word.startsWith("a"))
            .toList();
    }

    public static int[][] deepCopy(int[][] matrix) {
        return Arrays.stream(matrix)
            .map(array -> Arrays.copyOf(array, array.length))
            .toArray(int[][]::new);
    }
}
