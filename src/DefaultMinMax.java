// implements MinMax interface
public class DefaultMinMax<T extends Comparable<T>> implements MinMax<T> {

    // array from which we have to find minimum and maximum
    private T[] nums;

    // constructor
    // instantiate local instance variable
    public DefaultMinMax(T[] nums) {
        this.nums = nums;
    }

    // get the minimum value
    public T getMin() {
        T min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            // if we get a value < 0 here it means the object in the array
            // is less than the current minimum
            // for complete details see the documentation of compareTo method in Comparable interface
            if (nums[i].compareTo(min) < 0) {
                min = nums[i];
            }
        }
        return min;
    }

    // get the maximum value
    public T getMax() {
        T max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            // if we get a value > 0 here it means the object in the array
            // is greater than the current maximum
            // for complete details see the documentation of compareTo method in Comparable interface
            if (nums[i].compareTo(max) > 0) {
                max = nums[i];
            }
        }
        return max;
    }
}
