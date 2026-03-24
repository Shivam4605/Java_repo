package basic_logic_array.Arrays;

public class rotate_k_position_left {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        int k = 2;

        for(int i=0; i<k; i++){
            int first = arr[0];
            for(int j=1; j<arr.length; j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = first;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
