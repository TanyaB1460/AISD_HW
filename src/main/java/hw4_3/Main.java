package hw4_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {3, 30, 34, 5, 9};

        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                String ab = a.toString() + b.toString();
                String ba = b.toString() + a.toString();
                return ba.compareTo(ab);
            }
        });

        StringBuilder result = new StringBuilder();
        for (int num : numbers) {
            result.append(num);
        }

        System.out.println(result.toString());
    }
}