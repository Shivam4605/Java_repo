package basic_logic_array;

import java.util.HashSet;

class Solution {
    public static int missingNumber(int[] nums) {

        // int n = nums.length;

        // int expectedSum = n * (n + 1) / 2;
        // int actualSum = 0;

        // for (int num : nums) {
        // actualSum += num;
        // }

        // return expectedSum - actualSum;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int result = missingNumber(new int[] { 3, 0, 1 });
        System.out.println(result);
    }
}