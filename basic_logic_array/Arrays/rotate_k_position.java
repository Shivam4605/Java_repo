package basic_logic_array.Arrays;

public class rotate_k_position {
    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5};
        int k = 3;
        int n = arr.length; 

        for(int i=0; i<k; i++){
            int last = arr[n-1];
            for(int j=n-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
