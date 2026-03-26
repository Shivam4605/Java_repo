

// public class two_arrays_merge {
//     public static void main(String[] args){

//         int[] arr1 = new int[]{1,2,3};
//         int[] arr2 = new int[]{1,3,4};
//         int[] arr3 = new int[arr1.length+arr2.length];

//         // for(int i=0; i<arr1.length; i++){
//         //    arr3[i] = arr1[i];
//         // }
//         //  for(int i=0; i<arr2.length; i++){
//         //    arr3[arr1.length+i] = arr2[i];
//         // }
//         // System.out.print(Arrays.toString(arr3));

//         for(int i=0; i<arr1.length+arr2.length; i++){

//             if(arr1.length > i){
//                 arr3[i] = arr1[i];
//             }else{
//                 arr3[i] = arr2[i-arr1.length];
//             }
//         }

//         for(int i=0; i<arr3.length; i++){
//             for(int j=0; j<arr3.length; j++){
//                 if(arr3[i] < arr3[j]){
//                     int temp = arr3[i];
//                     arr3[i] = arr3[j];
//                     arr3[j] = temp;
//                 }
//             }
//         }
//         System.out.print(Arrays.toString(arr3));
//     }
// }

package basic_logic_array.Arrays;
import java.util.Arrays;

public class two_arrays_merge {

    public static int[] merge(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // while(i < n && j < m){

        //     if(arr1[i] <= arr2[j]){
        //         result[k++] = arr1[i++];
        //     }else{
        //         result[k++] = arr2[j++];
        //     }

        // }

        while(i < n){
            result[k++] = arr1[i++];
        }

        while(j < m){
            result[k++] = arr2[j++];
        }

         for(i=0; i<result.length; i++){
            for(j=0; j<result.length; j++){
                if(result[i] < result[j]){
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }

    public static void main(String[] args){

        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};

        int[] result = merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}