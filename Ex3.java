package Exercise;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        // Generate an array of 100,000 random numbers
        int[] array = generateRandomArray(100000);

        // Create a stopwatch
        StopWatch stopwatch = new StopWatch();

        // Perform selection sort
        selectionSort(array);

        // Stop the stopwatch
        stopwatch.stop();

        // Display the elapsed time
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // Method to generate an array of random numbers
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000); // Adjust the range as needed
        }
        return array;
    }

    // Selection sort algorithm
    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}

class StopWatch {
    private long startTime;
    private long endTime;

    // Constructors
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter methods
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Start the stopwatch
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Stop the stopwatch
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Calculate and return elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
