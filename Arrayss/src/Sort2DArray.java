import java.util.Arrays;

public class Sort2DArray {

    public static void main(String[] args) {
        int[][] array = {
                {2, 10, 15},
                {5, 1, 3},
                {6, 9, 4}
        };

        // bubble sort
        bubbleSort(array);
        System.out.println("Bubble Sort:");
        print2DArray(array);
        array = new int[][] {{2, 10, 15}, {5, 1, 3}, {6, 9, 4}};

        // selection sort
        selectionSort(array);
        System.out.println("Selection Sort:");
        print2DArray(array);
        array = new int[][] {{2, 10, 15}, {5, 1, 3}, {6, 9, 4}};

        // insertion sort
        insertionSort(array);
        System.out.println("Insertion Sort:");
        print2DArray(array);
        array = new int[][] {{2, 10, 15}, {5, 1, 3}, {6, 9, 4}};

        // quick sort
        quickSort(array, 0, array.length * array[0].length - 1);
        System.out.println("Quick Sort:");
        print2DArray(array);
    }


    public static void bubbleSort(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int n = rows * cols;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int[] pos1 = getPosition(j, cols);
                int[] pos2 = getPosition(j + 1, cols);

                if (array[pos1[0]][pos1[1]] > array[pos2[0]][pos2[1]]) {
                    int temp = array[pos1[0]][pos1[1]];
                    array[pos1[0]][pos1[1]] = array[pos2[0]][pos2[1]];
                    array[pos2[0]][pos2[1]] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int n = rows * cols;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                int[] posMin = getPosition(minIdx, cols);
                int[] posJ = getPosition(j, cols);

                if (array[posJ[0]][posJ[1]] < array[posMin[0]][posMin[1]]) {
                    minIdx = j;
                }
            }
            int[] posI = getPosition(i, cols);
            int[] posMin = getPosition(minIdx, cols);
            int temp = array[posI[0]][posI[1]];
            array[posI[0]][posI[1]] = array[posMin[0]][posMin[1]];
            array[posMin[0]][posMin[1]] = temp;
        }
    }
    public static void insertionSort(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int n = rows * cols;
        for (int i = 1; i < n; i++) {
            int[] posI = getPosition(i, cols);
            int key = array[posI[0]][posI[1]];
            int j = i - 1;

            while (j >= 0) {
                int[] posJ = getPosition(j, cols);
                if (array[posJ[0]][posJ[1]] > key) {
                    int[] posNext = getPosition(j + 1, cols);
                    array[posNext[0]][posNext[1]] = array[posJ[0]][posJ[1]];
                    j--;
                } else {
                    break;
                }
            }
            int[] posNext = getPosition(j + 1, cols);
            array[posNext[0]][posNext[1]] = key;
        }
    }
    public static void quickSort(int[][] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    private static int partition(int[][] array, int low, int high) {
        int cols = array[0].length;
        int[] posHigh = getPosition(high, cols);
        int pivot = array[posHigh[0]][posHigh[1]];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            int[] posJ = getPosition(j, cols);
            if (array[posJ[0]][posJ[1]] < pivot) {
                i++;
                int[] posI = getPosition(i, cols);
                int temp = array[posI[0]][posI[1]];
                array[posI[0]][posI[1]] = array[posJ[0]][posJ[1]];
                array[posJ[0]][posJ[1]] = temp;
            }
        }

        int[] posI = getPosition(i + 1, cols);
        int temp = array[posI[0]][posI[1]];
        array[posI[0]][posI[1]] = array[posHigh[0]][posHigh[1]];
        array[posHigh[0]][posHigh[1]] = temp;

        return i + 1;
    }
    private static int[] getPosition(int index, int cols) {
        return new int[] { index / cols, index % cols };
    }
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}

