package basic_logic_array;

public class array_element_same {
    public static void main(String[] args) {
        
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,8,3};
        boolean flag = true;

        if(arr1.length != arr2.length){
            flag = false;
        }else{
             for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}
