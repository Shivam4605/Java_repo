package basic_logic_array;

import java.util.Scanner;

public class find_ovels_into_string {

    static int find_ovels_into_string(String str){
        
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e'||ch == 'o' ||ch == 'u' || ch == 'i'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = scanner.next();
        int result = find_ovels_into_string(str);
        System.out.println("String Contains the vowels " + result);
    }
}
