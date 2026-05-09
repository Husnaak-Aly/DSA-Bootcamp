public class StartEnd {
    public static void main(String[] args) {
        int[] arr= {12,31,4,45,142,35};
        int target = 122;
        System.out.println(search(arr, target,1,3));


    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            int element= arr[i];

            if (element == target){
                return i;


            }

        }
        return -1;
    }
}
