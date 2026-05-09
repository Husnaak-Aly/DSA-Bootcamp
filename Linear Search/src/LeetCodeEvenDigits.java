public class LeetCodeEvenDigits {
    public static void main(String[] args) {
        int[] nums={12,143,15,2 ,21};
        //System.out.println(findNumbers(nums));
        System.out.println(digits(-25235));

    }
    static int findNumbers(int []arr){
        int count =0;
        for (int num: arr){
            if(even(num)){
                count++;
            }
        }

        return count;
    }
    static boolean even(int num){
        int numofdigits= digits(num);

        return numofdigits % 2 == 0;

    }
    static int digits(int num){
        if (num<0){
            num=num* -1;
        }
        int count = 0;
        while(num>0){
            count ++;
            num=num/10;
        }
        return count;
    }
}
