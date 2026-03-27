
package basic_logic_array.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 8, 2, 2, 3, 4, 4, 5, 5, 5 };

        for (int i = 0; i < arr.length; i++) {

            boolean flag = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                continue;

            System.out.print(arr[i] + " ");
        }

    }
}