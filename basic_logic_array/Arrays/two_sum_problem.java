package basic_logic_array.Arrays;

import java.util.Scanner;

public class two_sum_problem {

    static void two_sum_problem(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target value : ");
        int target = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum = arr[i]+arr[j];
                if(sum==target){
                    System.out.println(arr[i] + " pair is found " + arr[j] + " sum is : " + sum);
                }
            }
        }
    }
    public static void main(String[] args) {
        two_sum_problem();
    }
}


// class two_sum_problem {
//     public static int[] twoSum(int[] nums, int target) {

//         for(int i = 0; i < nums.length; i++){

//             for(int j = i + 1; j < nums.length; j++){

//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i, j};
//                 }

//             }

//         }
//         return new int[]{};
//     }

//     public static void main(String[] args) {
//       int[] result = twoSum(new int[]{2,7,11,15}, 9);

//         System.out.println(Arrays.toString(result));
//     }
// }