public class MaxE {
    public static void main(String[] args) {
        int[] arr ={3, 25 ,42, 5, 2};
        System.out.println(max(arr));

    }
    //imagine array is not empty
    public static int max(int[]arr){
        int max = arr[0];

        for (int i=0; i< arr.length; i++){
        if (arr[i]> max){
            max= arr[i];
        }

        }
        return max;

    }
}
