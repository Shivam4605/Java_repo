
class demo{
    public static void main(String[] args){

        // for(int i=0; i<4 ; i++){
        //     for(int j=0; j<4; j++){
        //         if(i == 0 || i== 3 || j == 0 || j == 3){
        //             System.out.print("*");
        //         }else{
        //             System.out.print( " ");
        //         }
        //     }
        //      System.out.println("");
        // }

        // for(int i=0; i<=4; i++){
        //     for(int j=0; j<=5-i; j++){
        //         System.out.print(" ");
        //     }for(int k=0; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     for(int k=0; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=0; i<5; i++){
        //     for(int j=0; j<5-i; j++){
        //         System.out.print(" ");
        //     }for(int k=0; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = scanner.nextInt();

        // int[] arr = new int[]{10,20,30,40,50};

        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == num){
        //         System.out.println("number are present into array");
        //         break;
        //     }
        // }

        String str = "aaabb";

        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }if(str.indexOf(str.charAt(i)) == i)
            System.out.print(str.charAt(i) + ":" + count + " ");
        }
    }
}
