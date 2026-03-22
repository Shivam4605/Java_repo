package basic_logic_array.Arrays;

public class remove_space_string {
    public static void main(String[] args){
         String str = "shivam mahadev kolekar";
        String rem = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                rem = rem + str.charAt(i);
            }
        }
        System.out.println(rem);
    }
}
