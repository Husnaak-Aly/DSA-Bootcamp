public class FindMin {
    public static void main(String[] args) {
        int[] arr={12,232,2,22,41,41};
        System.out.println(min(arr));
    }
    static  int min(int []arr){
        int min = arr[0];
        for (int i=0; i< arr.length; i++){

            if (arr[i]<min){
                min= arr[i];
                return min;
            }
        }
        return -1;

    }
}
