package basic_logic_array.Arrays;

import java.util.Arrays;

/* 
    Example 1:
    Input: nums = [3,1,2,4]
    Output: [2,4,3,1]
    Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

    Example 2:
    Input: nums = [0]
    Output: [0]
*/ 

public class sort_array_by_priority {

    public static int[] sortedBy(int[] nums){

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] % 2 == 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] result = sortedBy(new int[]{3,1,2,4});
        System.out.println(Arrays.toString(result));
    }
}
