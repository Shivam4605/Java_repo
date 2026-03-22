package basic_logic_array.Arrays;

public class long_string {
    public static void main(String[] args){
        String currentWord = "";
        String longestWord = "";
        String str = "i love development in flutter ";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                currentWord = currentWord + str.charAt(i);
            }else{
                 if(currentWord.length() > longestWord.length()){
                    longestWord = currentWord;
                }

                currentWord = "";
            }
        }
        if(currentWord.length() > longestWord.length()){
            longestWord = currentWord;
        }
        System.out.println("Longest word: " + longestWord);
    }
}
