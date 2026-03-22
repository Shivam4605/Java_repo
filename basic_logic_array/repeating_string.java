package basic_logic_array;
import java.util.Scanner;

public class repeating_string {
     static String  non_repeating_string(String str){

        String nonrepeating = "";
        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            } if(count >  1){
                nonrepeating = nonrepeating + str.charAt(i);
            }
        }
        return  nonrepeating;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
         String result =  non_repeating_string(st);
         System.out.println("repeating string is : " + result);
    }
}
