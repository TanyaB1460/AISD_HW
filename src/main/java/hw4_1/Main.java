package hw4_1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 8, 5, 3, 1, 2, 4, 6};
        int j = findJ(arr);
        System.out.println(j);
    }

    public static int findJ(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}