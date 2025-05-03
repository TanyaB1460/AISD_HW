package hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countWrongBrackets(s));
    }

    public static boolean countWrongBrackets(String str) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') count1++;
            else if (c == '{') count2++;
            else if (c == '[') count3++;

            else if (c == ')') {
                if (count1 == 0) return false;
                count1--;
            }
            else if (c == '}') {
                if (count2 == 0) return false;
                count2--;
            }
            else if (c == ']') {
                if (count3 == 0) return false;
                count3--;
            }
        }

        return count1 == 0 && count2 == 0 && count3 == 0;
    }
}