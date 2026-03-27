package basic_logic_array.Arrays;

import java.util.HashSet;

// public class array_duplicate {

//     public static int array_duplicate() {
//         int[] arr = new int[] { 1, 2, 3 };
//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < arr.length; i++) {
//             if (set.contains(arr[i]) == false) {
//                 set.add(arr[i]);
//             }
//         }

//         return set.size();
//     }

//     public static void main(String[] args) {
//         System.out.println(array_duplicate());

//     }
// }

public class array_duplicate {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 1, 2, 2, 3 };
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(i + 1);
    }
}