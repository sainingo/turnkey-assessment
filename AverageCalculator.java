// data type conversion bug

public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
        total += num;
        }
        // cast the total or numbers.length to double
        double average = (double) total / numbers.length;
        return average;
        }
        public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
        }

}
