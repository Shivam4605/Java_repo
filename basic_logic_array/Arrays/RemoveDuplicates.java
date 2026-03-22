
package basic_logic_array.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,3,8,2,2,3,4,4,5};

        int n = arr.length;

        for(int i = 0; i < n-1; i++){

            if(arr[i] != arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print(arr[n-1]);
    }
}