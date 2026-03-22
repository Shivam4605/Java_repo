package basic_logic_array.Arrays;

public class count_consonent_string {
    public static void main(String[] args){
        String str = "Shivam";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != 'a' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'i' && str.charAt(i) != 'e'){
                count++;
            }
        }
        System.out.println("consonent of String is : " + count);
    }
}
