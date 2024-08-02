import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// contains solutions to homework problems
public class Homework {

    // Write a Java program to create a generic method that takes an
    // array of numbers and prints the sum of all the even and odd numbers.
    public static <T extends Number> void printOddEvenSum(T[] nums) {
        double sumEven = 0,
                sumOdd = 0;

        // loop over array and find odd and even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].doubleValue() % 2 == 0) {
                // even num
                sumEven = sumEven + nums[i].doubleValue();
            } else {
                // odd num
                sumOdd = sumOdd + nums[i].doubleValue();
            }
        }

        // print
        System.out.println("Sum of even numbers ==> " + sumEven);
        System.out.println("Sum of odd numbers ==> " + sumOdd);
    }

    // Write a generic method to find the maximal element in the range [begin, end) of an array.
    public static <T extends Comparable<T>> void maximalElement(T[] nums, int begin, int end) {
        T max = nums[begin];
        for (int i = begin; i <= end; i++) {
            if (nums[i].compareTo(max) > 0) {
                max = nums[i];
            }
        }
        System.out.println("Maximal Element in range ==> " + max);
    }

    // Write a Java program to create a generic method that takes an array of any type and
    // returns it as a new list with the elements in reverse order.
    public static <T> List<T> reverseArray(T[] nums) {
        List<T> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
        }
        return list;
    }
}
