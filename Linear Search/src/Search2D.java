import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {

        int [][] arr= {
                {32,2,52,24,52,22},
                {23,12,410,411,500,1},
                {14,2,41,414,141},
                {3,7,66}
        };
//        int target = 7;
//        int[] ans= search(arr,target);
//        System.out.println(Arrays.toString(ans));
        int ans = max(arr);
        System.out.println(ans);


    }
//    static  int[] search (int[][] arr, int target){
//        for (int row=0; row<arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col]==target){
//                    return new int[]{row,col};
//                }
//
//            }
//        }
//            return new int[] {-1,-1};
//    }

    static  int max ( int [][]arr){
        int max = arr[0][0];
        for (int row=0; row<arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max =arr[row][col];

                }

            }

        }
        return max;
    }
}
