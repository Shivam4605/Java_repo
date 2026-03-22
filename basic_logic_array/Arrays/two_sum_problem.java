package basic_logic_array.Arrays;

import java.util.Scanner;

public class two_sum_problem {

    static void two_sum_problem(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target value : ");
        int target = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i+1; j<arr.length; j++){
               
                sum = arr[i]+arr[j];

                if(sum==target){
                    System.out.println(arr[i] + " pair is found " + arr[j] + " sum is : " + sum);
                }
            }
        }
    }
    public static void main(String[] args) {
        two_sum_problem();
    }
}
