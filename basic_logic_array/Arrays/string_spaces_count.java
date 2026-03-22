package basic_logic_array.Arrays;

import java.util.Scanner;

public class string_spaces_count {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("space in string is : " + count);
    }
}
