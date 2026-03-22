package basic_logic_array.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        for(int i=arr.length; i>0; i--){
            System.out.println(arr[i-1]);
        }
    }
}
