package basic_logic_array.Arrays;

public class count_consonent_string {
    public static void main(String[] args){
        String str = "Shivam";
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(int i=0; i<str.length(); i++){
            if(vowels.indexOf(str.charAt(i)) == -1){
                count++;
            }
        }
        System.out.println("consonent of String is : " + count);
    }
}
