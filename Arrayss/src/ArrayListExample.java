import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        Scanner sc = new Scanner(System.in);

        for (int i=0 ; i<5; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
