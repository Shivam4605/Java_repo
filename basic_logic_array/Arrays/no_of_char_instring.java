package basic_logic_array.Arrays;
import java.util.*;

public class no_of_char_instring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Sting : ");
        String str = scanner.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("No of character is : " + (count+1));
    }
}

