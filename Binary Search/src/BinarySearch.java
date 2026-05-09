// Java implementation of Iterative Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-14,-3,-1,0,12,41,53,75,99};
        int target=-14;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2; //because (start+end)/2 can exceed the range of int for larger value
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}