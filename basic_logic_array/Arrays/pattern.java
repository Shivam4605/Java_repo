package basic_logic_array.Arrays;

public class pattern {
    public static void main(String[] args){

        // for(int i=0; i<5; i++){
        //     for(int j=0; j<=i; j++){
        //         if(j == 0 || j == i || i == 4){
        //             System.out.print("*" );
        //         }else{
        //             System.out.print(" ");
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.print(" ");
        //     System.out.println();
        // }
        // int n = 5;
        // for(int i=0; i <=n; i++){

        //     for(int j=0; j<= n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=0; j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // char ch = 'A';

        // for(int i=0; i<5; i++){
        //     for(int j=0; j<5-i; j++){
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        //     ch = 'A';
        // }


       char ch = 'A';
       int count = 0;

       for(int i = 0; i<3; i++){
        if(i % 2 == 0){
            ch = 'C';
        }else{
            ch = 'A';
        }
       count = 0;

        for(int j = 0; j<3; j++){
            if(i % 2 == 0){
                if(j % 2 != 0){
                    count = (int)ch;
                    System.out.print(count - 64);
                    ch--;
                }else{
                    System.out.print(ch);
                    ch--;
                } 
            }else{
                 if(j % 2 != 0){
                     count = (int)ch;
                    System.out.print(count - 64);
                    ch++;
                }else{
                    System.out.print(ch);
                    ch++;
                }
            }
          }
          System.out.println(); 
       }
    }
}
