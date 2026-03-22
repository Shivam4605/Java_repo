package basic_logic_array.Arrays;

public class palindrom_string {
    public static void main(String[] args){

        String str= "level";
        String reverseStr = "";

        for(int i=str.length()-1; i>=0; i--){
            reverseStr = reverseStr + str.charAt(i);
        }
    
        if(str.equals(reverseStr)){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not palindrom");

        }
    }
}
