package basic_logic_array.Arrays;

public class find_duplicate_array_element {
    public static void main(String[] args) {
        int[] arr = new int[]{50,10,20,30,10,20,30,50,40,50,50,50};

        for(int i=0; i<arr.length; i++){
            int count = 0;
            boolean isVisited = false;
            for(int k = 0; k<i; k++){
                if(arr[i] == arr[k]){
                    isVisited = true;
                    break;
                }
            }
            if(isVisited) continue;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }
    }
}
