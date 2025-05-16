package hw2_2;
import java.util.HashMap;

public class CheckDuplicates {

    public static boolean hasCloseDuplicates(int[] numbers, int maxDistance) {
        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];

            if (lastSeen.containsKey(currentNum) &&
                    i - lastSeen.get(currentNum) <= maxDistance) {
                return true;
            }
            lastSeen.put(currentNum, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 3, 1, 5};
        int distance = 3;

        boolean result = hasCloseDuplicates(testNumbers, distance);
        System.out.println("Есть близкие дубликаты: " + result);
    }
}
