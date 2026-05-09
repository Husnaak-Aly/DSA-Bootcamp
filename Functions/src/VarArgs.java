import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(32,13,44,14,11,45);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
