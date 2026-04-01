public class demo {
    public static void main(String[] args){

        String name = "A man, a plan, a canal: Panama";
        String str = "";
        String str2 = "";

        if(name.length() == ' '){
            System.out.println("String is Empty");
        }else{
            for(int i = name.length() - 1; i >= 0; i--){
            if(name.charAt(i) != ' ' && name.charAt(i) != ',' && name.charAt(i) != ':'){
                str += name.charAt(i);
            }
        }

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) != ' ' && name.charAt(i) != ',' && name.charAt(i) != ':'){
                str2 += name.charAt(i);
            }
        }
        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        if(str.equals(str2)){
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
        }
    }
}
