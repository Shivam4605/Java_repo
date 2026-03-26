package basic_logic_array;

import java.util.Arrays;

public class a {

    public static int[] arry(){
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    return new int[]{nums1[i]};
                }
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
       int[] result =  arry();
       System.out.println(Arrays.toString(result));
    }
}
