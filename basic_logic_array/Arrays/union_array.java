package basic_logic_array.Arrays;

public class union_array {
    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        int[] arr2 = {2, 3};

        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;

        for(int i = 0; i < arr1.length; i++){
            arr3[k++] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){

            boolean found = false;

            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    found = true;
                    break;
                }
            }
            if(!found){
                arr3[k++] = arr2[i];
            }
        }

        System.out.println("Union Array:");
        for(int i = 0; i < k; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}