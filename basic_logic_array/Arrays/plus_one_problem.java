package basic_logic_array.Arrays;

import java.util.Arrays;

// import java.util.Arrays;

// class plus_one_problem {
//     // public static int[] plusOne(int[] digits) {

//     //     for(int i = digits.length - 1; i >= 0; i--) {

//     //         if(digits[i] < 9) {
//     //             digits[i]++;     
//     //             return digits;   
//     //         }

//     //         digits[i] = 0;    
//     //     }

  
//     //     int[] result = new int[digits.length + 1];
//     //     result[0] = 1;

//     //     return result;
//     // }

//     public static int[] plusOne(int[] digits) {
        
//         for(int i=digits.length-1; i>=0; i--){

//             if(digits[i] < 9){
//                 digits[i]++;
//                 return digits;
//             }

//             digits[i] = 0;
//         }

//         int[] result = new int[digits.length + 1];
//         result[0] = 1;

//         return result;
//     }

//       public static void main(String[] args) {
//         int[] result =  plusOne(new int[]{9,9});
//         System.out.println(Arrays.toString(result));
//     }
// }


class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        
        for(int i=0; i<=numbers.length; i++){
            for(int j=0; j<=numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(sum == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15},5);
        System.out.println(Arrays.toString(result));
    }
}