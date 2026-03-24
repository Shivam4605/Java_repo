package basic_logic_array.Arrays;
import java.util.*;
public class two_arrays_merge {
    public static void main(String[] args){

        int[] arr1 = new int[]{10,20,30};
        int[] arr2 = new int[]{40,50,60};
        int[] arr3 = new int[arr1.length+arr2.length];
        // for(int i=0; i<arr1.length; i++){
        //    arr3[i] = arr1[i];
        // }
        //  for(int i=0; i<arr2.length; i++){
        //    arr3[arr1.length+i] = arr2[i];
        // }
        // System.out.print(Arrays.toString(arr3));

        for(int i=0; i<arr1.length+arr2.length; i++){

            if(arr1.length > i){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[i-arr1.length];
            }
        }
        System.out.print(Arrays.toString(arr3));
    }
}
