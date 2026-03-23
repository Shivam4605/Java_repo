package basic_logic_array.Arrays;

public class intersection_array {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{4,2,6};
       
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
                System.out.println("intersection of two array elements is : " + arr1[i]);
            }
        }
    }
}
