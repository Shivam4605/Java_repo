package basic_logic_array.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// public class remove_element {

//     public static int removeElement(int[] nums, int val) {

//         int count = 0;
//         // HashSet<Integer> set = new HashSet<>();

//         // for (int i = 0; i < nums.length; i++) {

//         // if (nums[i] != val) {
//         // set.add(nums[i]);
//         // }
//         // }
//         // System.out.println(set);
//         // return set.size();
//     }

//     public static void main(String[] args) {
//         System.out.println(removeElement(new int[] { 3, 2, 2, 3, 1 }, 3));
//     }
// }

// class Solution {
//     public static int search(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
//     }
// }

// class Solution {
//     public static int[] searchRange(int[] nums, int target) {
//         int first = -1;
//         int last = -1;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {

//                 if (first == -1) {
//                     first = i;
//                 }

//                 last = i;
//             }
//         }

//         return new int[] { first, last };

//     }

//     public static void main(String[] args) {
//         int[] result = searchRange(new int[] { 5, 7, 7, 8, 8, 8, 10 }, 8);
//         System.out.println(Arrays.toString(result));
//     }
// }

public class remove_element {

    public static int[] second_largest_element(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            return new int[] { -1, -1 };
        }

        return new int[] { list.get(0), list.get(list.size() - 1) };
    }

    public static void main(String[] args) {

        int[] result = second_largest_element(new int[] { 5, 7, 7, 8, 8, 8, 10 }, 8);
        System.out.println(Arrays.toString(result));

    }
}