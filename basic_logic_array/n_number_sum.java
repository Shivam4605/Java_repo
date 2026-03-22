package basic_logic_array;

import java.util.Scanner;

public class n_number_sum {

    static int n_number_sum(int num){

        int sum = 0;
        while(num > 0){
            int mod = num % 10;
            sum = sum + mod;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int result = n_number_sum(number);
        System.out.println("sum od n'th number is : " + result);
    }
}
