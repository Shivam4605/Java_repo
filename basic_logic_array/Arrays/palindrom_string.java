package basic_logic_array.Arrays;

public class palindrom_string {
    public static void main(String[] args){

        String str= "level";
        String reverseStr = "";

        for(int i=str.length()-1; i>=0; i--){
            reverseStr = reverseStr + str.charAt(i);
        }
    
        if(str.equals(reverseStr)){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not palindrom");

        }
    }
}


// public class palindrom_string{

//     public static boolean ispalindrom(int x){

//         int pali = 0;
//         int original = x;
//         while(x > 0){
//             int mod = x % 10;
//             pali = pali * 10 + mod;
//             x = x / 10;
//         }
//         if(pali == original){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args){
//        boolean result =  ispalindrom(121);
//        System.out.println(result);
//     }
// }