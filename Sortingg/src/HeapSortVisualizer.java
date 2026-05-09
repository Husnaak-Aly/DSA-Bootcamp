import javax.swing.*;
import java.awt.*;

public class HeapSortVisualizer extends JPanel {
    private int[] array;
    private int barWidth;
    private int delay;

    public HeapSortVisualizer(int[] array, int delay) {
        this.array = array;
        this.barWidth = Math.max(1, 800 / array.length);  // Ensure bars are visible even for larger arrays
        this.delay = delay;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < array.length; i++) {
            int barHeight = array[i]*25;  // Use array[i] value directly for height

            // Set the color and draw the bars
            g.setColor(Color.BLUE);
            g.fillRect(i * barWidth, getHeight() - barHeight, barWidth, barHeight);

            // Set the font and draw the values on top of each bar
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 12));  // Set font for the values
            g.drawString(String.valueOf(array[i]), i * barWidth + barWidth / 4, getHeight() - barHeight - 5);
        }
    }

    public void visualizeSort() {
        new Thread(() -> {
            heapSort(array);  // Perform the heap sort operation
        }).start();
    }

    // Heap Sort Implementation
    static void heapify(int[] array, int n, int i) {
        int largest = i;         // Initialize largest as root
        int left = 2 * i + 1;    // left child index
        int right = 2 * i + 2;   // right child index

        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }

    // Heap Sort Implementation
    void heapSort(int[] array) {
        int n = array.length;

        // Build the heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
            repaint();  // Visualize the heap build process
            sleep();    // Pause to show the build step-by-step
        }

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call max heapify on the reduced heap
            heapify(array, i, 0);
            repaint();  // Visualize the sorting process
            sleep();    // Pause to show the sorting step-by-step
        }
    }

    // Delay the sorting to visualize it clearly
    private void sleep() {
        try {
            Thread.sleep(delay);  // Slow down the sorting process for visualization
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Heap Sort Visualization with Values");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        // Define the array to be sorted
        int[] array = {12, 11, 13, 14, 7, 6};

        // Create the visualizer and add it to the frame
        HeapSortVisualizer visualizer = new HeapSortVisualizer(array, 1000);  // Set delay to 500 ms for visualization
        frame.add(visualizer);
        frame.setVisible(true);

        // Start visualization
        visualizer.visualizeSort();
    }
}
