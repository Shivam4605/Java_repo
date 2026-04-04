package basic_logic_array;
import java.util.Scanner;

public class find_number_array {

    static boolean  find_number_array(int num){
        
        int[] arr =  new int[]{10,20,30,40,50,60,70};
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return  flag = true;
            }else{
                return flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        boolean result = find_number_array(number);
        System.out.println(result);
    }
}
