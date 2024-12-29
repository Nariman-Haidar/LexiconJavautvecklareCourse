import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Creat overloaded add method that add two integers:
    public static int add(int x, int y) {
        return x + y;
    }

    // Creat overloaded add method that Concatenate two strings:
    public static String add(String a, String b) {
        return a + b;
    }

    // Creat overloaded add method that add three integers:
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    //  Create a method that calculates the circle area of the given radius.
    private static double calculateCircleArea(double radious) {
        return Math.PI * Math.pow(radious, 2);
    }

//  Create a method that calculates the circle Circumference of the given radius.

    private static double calculateCircleCircumference(double radious) {
        return 2 * Math.PI * radious;
    }

    /**
     * * This method sorts an array of integers in ascending order and then performs a binary search to find the specified value.
     * * * Steps:
     * * 1. Sort the array using Arrays.sort().
     * * 2. Print each element of the sorted array.
     * * 3. Perform a binary search using Arrays.binarySearch() to find the specified value.
     * * 4. If the value is found, assign it to the variable 'value1' (though 'value1' is not used further).
     * * Otherwise, set 'i' to -1 (though 'i' is not used further).
     * * 5. Return the result of the binary search, which is the index of the found value or a negative value if not found.
     */
    private static int findWithBinarySearch(int[] numbers, int value) {
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int result = Arrays.binarySearch(numbers, value);

        if (result == value) {
            int value1 = value;
        } else {
            int i = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        // System.out.println("Write your name : " );
        // String name = scaner.nextLine();
        // System.out.println("Hello "+ name + ":)");
        double radious = 5.0;

        // call methods to calculate area and circum
        double area          = calculateCircleArea(radious);
        double circumference = calculateCircleCircumference(radious);

        // System.out.println("Add tow integers: " + add(2,3));
        // System.out.println("Add three integers: " + add(2,3,4));
        // System.out.println("Add concatrate two strings: " + add("He","llo"));
        // System.out.println("Area: " + area);
        // System.out.println("Circumference: " + circumference);
        // Create and initialize an array
        int[] numbers = {
                12, 5, 18, 7, 21, 9, 3, 15, 6, 11
        };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------------------------------");

        // Search for a value using findWithBinarySearch
        // int value       = 77;
        int value       = 15;
        int resultIndex = findWithBinarySearch(numbers, value);

        if (resultIndex >= 0) {
            System.out.println("Value found at index: " + resultIndex);
        } else {
            System.out.println("Value not found in the array.");
        }
    }
}

