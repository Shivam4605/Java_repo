package basic_logic_array.Arrays;

public class first_non_repeating_char {
    public static void main(String[] args){
         String str = "swiss";
       
        for(int i=0; i<str.length(); i++){
             int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("first non repeating character : " + str.charAt(i));
                break;
            }
        }
    }
}
