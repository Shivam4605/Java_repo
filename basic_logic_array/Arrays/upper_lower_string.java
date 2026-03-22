package basic_logic_array.Arrays;

public class upper_lower_string {
    public static void main(String[] args){
        String str1 = "shivam";
        String str2 = "SHIVAM";

        for(int i=0; i<str1.length(); i++){
            System.out.println("Upper Case String : " + str1.toUpperCase());
            break;
        }

         for(int i=0; i<str2.length(); i++){
            System.out.println("Lower Case String : " + str1.toLowerCase());
            break;
        }
    }
}
