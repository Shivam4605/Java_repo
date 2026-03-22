package basic_logic_array.Arrays;

import java.util.Arrays;

public class second_largest_element {
    public static void main(String[] args){

        int[] arr = new int[]{10,50,60,0,80,6,4,58,78};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] <= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("second largest element into the array : " + arr[arr.length-2]);
        System.out.println("sorted array is the : " + Arrays.toString(arr));
    }
}
