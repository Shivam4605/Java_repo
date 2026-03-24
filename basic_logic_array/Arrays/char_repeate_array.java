package basic_logic_array.Arrays;

public class char_repeate_array {
    public static void main(String[] args) {
        
        char[] arr = new char[]{'a','b','a','c'};

        for(int i=0; i<arr.length; i++){

           boolean isvisited = false;

           for(int k=0; k<i; k++){
            if(arr[i] == arr[k]){
                isvisited = true;
                break;
            }
         }
         if(isvisited)continue;
         System.out.print(arr[i] + " ");
        }
    }
}
