package basic_logic_array;

//     public static int[] arry(){
//         int[] nums1 = new int[]{4,9,5};
//         int[] nums2 = new int[]{9,4,9,8,4};

//         for(int i=0; i<nums1.length; i++){
//             for(int j=0; j<nums2.length; j++){
//                 if(nums1[i] == nums2[j]){
//                     return new int[]{nums1[i]};
//                 }
//             }
//         }

//         return new int[]{};
//     }
//     public static void main(String[] args) {
//        int[] result =  arry();
//        System.out.println(Arrays.toString(result));
//     }
// }


// public class a{

//     public static void main(String[] args) {
//         int[] arr = new int[]{1};

//         for (int i = 0; i <arr.length; i++) {
//             int count = 0;
//             for(int j=0; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 System.out.println("non repeating elements is : "  + arr[i]);
//             }
//         }
//     }
// }


public class a {
    public static int singleNumber(int[] nums) {
         for (int i = 0; i <nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int result = singleNumber(new int[]{1});
       System.out.println(result);
    }
}
