import java.util.Scanner;

public class ArmsExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
       // System.out.println(isArmstrong(n));
        for (int i = 100; i <1000 ; i++) {
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }

        }

    }
    static boolean isArmstrong (int n){
        int orginal =n;
        int sum=0;

        while(n>0){
            int rem=n%10;
            n=n/10;
            sum+= rem*rem*rem;

        }
        return sum == orginal;


    }
}
