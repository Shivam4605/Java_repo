package basic_logic_array;
public class find_min_number {
    static int find_number_array(){
             int[] arr = new int[]{7,1,2,3,4,5,6};
             int min = arr[0];

             for(int i=0; i<arr.length; i++){
                if(arr[i] < min){
                    return arr[i];
                }
             }
             return min;
    }
    public static void main(String[] args) {
        
            int result = find_number_array();
            System.out.println("Min number in array is : " + result);
    }
}
