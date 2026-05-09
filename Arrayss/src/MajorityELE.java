import java.util.Arrays;
public class MajorityELE {
    public static void main(String[] args) {
        int[] arr={2,2,1,2,4,3,2,2,2,1};
        int ans =major(arr);
        if(ans==-1){
            System.out.println("There is no majority element");
        }
        else System.out.println("Majority element is "+ans);

    }
//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];
//    }
    static int major(int[] arr){
        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (k == j) {

                    count++;
                }

            }
            if (count > arr.length / 2)
                return j;
        }
        return -1;
    }
}
