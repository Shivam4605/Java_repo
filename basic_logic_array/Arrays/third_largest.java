package basic_logic_array.Arrays;
import java.util.Arrays;

public class third_largest{

    public static int thirdLargest(){
        int[] arr = new int[]{3,2,1};
        Arrays.sort(arr);

        if(arr.length < 3){
            return arr[arr.length-1];
        }
        return arr[arr.length-3];
    }
    public static void main(String[] args){
        System.out.println(thirdLargest());
    }
}