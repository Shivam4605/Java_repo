package basic_logic_array;
import java.util.Arrays;

public class push_all_zero_to_end {
    public static void main(String[] args) {
        
        int[] arr = new int[]{0,10,20,30,0,50,40};
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
            System.out.println(Arrays.toString(arr));  
        }
    }


    