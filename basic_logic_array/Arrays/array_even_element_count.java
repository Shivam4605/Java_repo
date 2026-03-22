package basic_logic_array.Arrays;

public class array_even_element_count {

    static void array_even_element_count(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("even element of array count is : " + count);
    } 

     static void array_odd_element_count(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        System.out.println("odd element of array count is : " + count);
    } 
    public static void main(String[] args){
      array_even_element_count();
      array_odd_element_count();
    }
}
