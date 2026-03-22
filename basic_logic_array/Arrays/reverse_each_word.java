package basic_logic_array.Arrays;

public class reverse_each_word {

    public static void main(String[] args){

        String str = "i love flutter development";
        String word = "";
        int count = 0;

        for(int i = 0; i < str.length(); i++){
             
            if(str.charAt(i) != ' '){
                word = word + str.charAt(i);
                count++;
            } 
            if(str.charAt(i) == ' '){

                for(int j = word.length()-1; j >= 0; j--){
                    
                    if(word.indexOf(word.charAt(j)) == j) {
                        System.out.print(word.charAt(j));
                        System.out.print(count);
                    }
                }

                System.out.print(" ");
                word = "";
                count = 0;
            }
        }
        for(int j = word.length()-1; j >= 0; j--){
            System.out.print(word.charAt(j));
            System.out.print(count);
        }
    }
}