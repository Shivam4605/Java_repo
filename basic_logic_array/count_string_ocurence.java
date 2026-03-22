package basic_logic_array;

import java.util.Scanner;

public class count_string_ocurence {
    static void count_string_ocurence(String str){

        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }if(str.indexOf(str.charAt(i)) == i){
                System.out.print(str.charAt(i) + ":" + count + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = scanner.next();
        count_string_ocurence(st);
    }
}
