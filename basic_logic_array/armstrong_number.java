package basic_logic_array;

import java.util.Scanner;

public class armstrong_number {

    static int armStrong_number(int num){
        int sum = 0;
        while(num > 0){
            int mod = num % 10;
            sum = sum + ( mod * mod * mod );
            num = num / 10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        int result = armStrong_number(number);
        if(result == number){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
}
