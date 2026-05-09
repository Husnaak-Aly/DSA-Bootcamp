import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //search array for an element
//        int[] nums={13,24,2,42,45,20,53};
//        int target= sc.nextInt();
//       int ans= linearSearch(nums, target);
//        System.out.println("["+ans+"]");
        String str = "Husnaak";
        char target ='H';
        System.out.println(search(str,target));
    }
    static int linearSearch(int [] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            if (element==target)
                return i;
        }
        return -1;

    }
    static  boolean search (String str, char ch){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(ch==str.charAt(i)){
                return true;
            }

        }
          return false;
    }
}