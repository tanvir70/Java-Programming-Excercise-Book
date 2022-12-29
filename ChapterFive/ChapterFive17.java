public class ChapterFive17 {
    public static void main(String[] args) {
        // Declare an array to store the Fibonacci series
        int[] series = new int[20];

        // Initialize the first two values in the series
        series[0] = 0;
        series[1] = 1;

        // Generate the rest of the series
        for (int i = 2; i < series.length; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        // Print the series
        for (int num : series) {
            System.out.println(num);
        }
    }

}
