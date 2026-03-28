package basic_logic_array.Arrays;
import java.util.Arrays;
public class find_Disappeared_Numbers {
    public static int findDisappearedNumbers(int[] g,int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; 
        int j = 0;

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1,2};
        int[] s = new int[]{1,2,3};
        int result = findDisappearedNumbers(g,s);
        System.out.println(result);
    }
}
