// find the average of numbers
public class Average<T extends Number> {

    // find the average of this array
    private T[] nums;

    // constructor
    // instantiate local instance variable
    public Average(T[] nums) {
        this.nums = nums;
    }

    // method to find out the average
    public double average() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue();
        }
        return sum / nums.length;
    }
}
