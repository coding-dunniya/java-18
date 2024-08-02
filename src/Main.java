import java.util.Arrays;

// main class - contains main method
public class Main {

    // main method - called by jvm
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 23, 34, 45, 56};
        Integer[] sortedArr = sort(arr);

        Double[] darr = new Double[]{4.5, 3.4, 44.56, 56.67, 12.23, 21.34, 44.9, 56.8};
        Double[] sortedDArr = sort(darr);

        String[] sarr = new String[]{"hello", "world"};
        boolean c1 = check("hello", sarr);

        Integer[] iarr = new Integer[]{1, 2, 3};
        boolean c2 = check(5, iarr);

        System.out.println("value of c1 ==> " + c1);
        System.out.println("value of c2 ==> " + c2);

        MinMax<Integer> mm = new DefaultMinMax<>(new Integer[]{1, 3, 4, 5, 77, 89});
        System.out.println("minimum value in array ==> " + mm.getMin());
        System.out.println("maximum value in array ==> " + mm.getMax());

        // generic inheritance
        GenericParent<String> parent = new GenericParent<>("hello");
        GenericChild<String, Integer> child = new GenericChild<>("hello", 1);
    }

    // method to sort all types of numbers
    private static <T> T[] sort(T[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // method to check if object is in array or not
    private static <T, V> boolean check(T x, V[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (x.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }
}




















