package hw4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String reversed = reverseWords(input);
        System.out.println("Результат:");
        System.out.println(reversed);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];

            if (i > 0) {
                result += " ";
            }
        }

        return result;
    }
}