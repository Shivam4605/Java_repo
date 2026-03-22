package basic_logic_array;

import java.util.Scanner;

public class strong_number {
public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int sum = 0;
        int n = num;
        while(num > 0){
            int mod = num % 10;
            int fact = 1;

            for(int i=1; i<=mod; i++){
                fact = fact * i;
            }
            System.out.println(fact);
            sum = sum + fact;
            num = num / 10;
        }
        if( n== sum){
            System.out.println("number is strong");
        }else{
            System.out.println("number is not strong");
        }
    }
}

