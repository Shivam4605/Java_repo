package basic_logic_array;

import java.util.Scanner;

public class longest_prefix_of_same_char {

    static int longest_prefix_of_same_char(String str){
        
        if(str.length() == 0){
            return 0;
        }else{
            for(int i=0; i<str.length(); i++){
                int count = 0;
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String str = scanner.next();

        int result = longest_prefix_of_same_char(str);
        System.out.println(result);
    }
}
