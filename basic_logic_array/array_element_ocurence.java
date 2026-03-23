package basic_logic_array;

public class array_element_ocurence {
    public static void main(String[] args){
         int[] arr1 = new int[]{1,2,3,2,3,3,5,4,5};
       
        for(int i=0; i<arr1.length; i++){
            int count = 0;
            boolean isvisited = false;
            for(int k = 0; k<i; k++){
                if(arr1[i] == arr1[k]){
                    isvisited = true;
                    break;
                }
            }
            if(isvisited) continue;
            for(int j = 0; j < arr1.length; j++){
              if(arr1[i] == arr1[j]){
               count++;
            }
    }

    System.out.println(arr1[i] + " : " + count);
           
        }
    }
}
