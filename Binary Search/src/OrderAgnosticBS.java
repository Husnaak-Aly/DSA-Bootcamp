public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={-14,-3,-1,0,12,41,53,75,99};
        int[] arr={99,88,77,66,55,44,33,22,11};
        int target=11;
        int ans= orderagnostic(arr,target);
        System.out.println(ans);
    }
    static int orderagnostic(int[] arr, int target){
        int s=0;
        int end=arr.length-1;

        boolean isAsc = arr[s]<arr[end];
//        if(arr[s]<arr[end]){
//            isAsc=true;
//        }
//        else {
//            isAsc=false;
//        }

        while (s<=end){
            int mid = s+ (end-s)/2;

            if (target==arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                } else  {
                    s = mid+1;
                }

            }else {
                if (target>arr[mid]){
                    end = mid-1;
                } else  {
                    s = mid+1;
                }
            }


        }
        return -1;
    }
}
