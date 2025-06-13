package hw7_1;

import java.util.HashMap;
import java.util.Map;

public class threeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Map<Integer, Integer> numCounts = new HashMap<>();

        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i];
                int b = nums[j];
                int needed = target - (a + b);

                if (numCounts.containsKey(needed)) {
                    if (needed != a && needed != b || numCounts.get(needed) > (a == needed ? 1 : 0) + (b == needed ? 1 : 0)) {
                        int currentSum = a + b + needed;
                        if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                            closestSum = currentSum;
                            if (closestSum == target) {
                                return closestSum;
                            }
                        }
                    }
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
