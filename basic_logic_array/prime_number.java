package basic_logic_array;
import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a number");
        int num = sc.nextInt();

        boolean flag = true;

        if (num <= 1) {
            flag = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}