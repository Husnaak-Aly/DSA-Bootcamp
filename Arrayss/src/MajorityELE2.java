public class MajorityELE2 {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,4,3,2,1,2,1};
        int ans =major2(arr);
        if(ans==-1){
            System.out.println("There is no majority element");
        }
        else System.out.println("Majority element is "+ans);

    }
    static int major2(int[] arr){
        for (int i=0;i< arr.length;i++){
            int count=0;
            for (int j=0; j< arr.length; j++){
                if (arr[j]==arr[i]){

                    count++;
                }

            }
            if(count>arr.length/3)
                return arr[i];
        }
        return -1;
    }
}
