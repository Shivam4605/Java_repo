package basic_logic_array;

import java.util.Scanner;

public class reverse_string {
    
    static String reverse_string(String str){
        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result = result + str.charAt(i);
        }

        return  result;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String here");
        String st = scanner.next();
        String result =  reverse_string(st);
        System.out.println(result);
    }
}
