package basic_logic_array;
public class check_array_positive {

    static boolean  check_array_positive(){

        int[] arr = new int[]{10,20,30,-50};
      
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                System.out.println("negative number is : " + arr[i]);
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        
        boolean result = check_array_positive();
        System.out.println("Array result is : " + result);

    }
}
