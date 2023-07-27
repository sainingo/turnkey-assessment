package LargestDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a list of numbers separated by spaces: ");
            String input = scanner.nextLine();

            List<Integer> numbers = parseInput(input);
            int largestDifference = findLargestDifference(numbers);

            System.out.println("The largest difference is: " + largestDifference);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a list of numbers separated by spaces.");
        } finally {
            scanner.close();
        }
    }


    public static int findLargestDifference(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return 0;
        }

        int min = numbers.get(0);
        int maxDiff = 0;

        for (int i = 1; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            if (currentNum < min) {
                min = currentNum;
            } else {
                int diff = currentNum - min;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        return maxDiff;
    }

    private static List<Integer> parseInput(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] tokens = input.trim().split("\\s+");

        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }

        return numbers;
    }
}
