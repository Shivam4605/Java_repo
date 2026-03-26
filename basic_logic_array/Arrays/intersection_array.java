package basic_logic_array.Arrays;

import java.util.Arrays;

public class intersection_array {

    public static int[] array(){
         int[] arr1 = new int[]{1,2,3,6,7,8};
        int[] arr2 = new int[]{4,2,6,1,3,8};
        int k = 0;
        int[] arr3 = new int[arr1.length];
        boolean flag = false;
        for(int i=0; i<arr1.length; i++){
            flag = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                // System.out.println("intersection of two array elements is : " + arr1[i]);
                arr3[k++] = arr1[i];
                
            }
        }
        return  arr3;
    }
    public static void main(String[] args) {
    int[] result = array();
    System.out.println(Arrays.toString(result));
     
  }
}