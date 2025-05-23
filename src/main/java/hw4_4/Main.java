package hw4_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 5, 11, 10, 12};
        int limit = 30;
        System.out.println(findMaxNumbers(numbers, limit));
    }

    public static int findMaxNumbers(int[] nums, int maxSum) {
        Arrays.sort(nums);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            if (sum > maxSum) {
                break;
            }
            count++;
        }

        return count;
    }
}