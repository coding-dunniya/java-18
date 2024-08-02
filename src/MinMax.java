// find the minimum and maximum value
public interface MinMax<T extends Comparable<T>> {

    // we can use this T parameter in this interface

    // get the minimum value from array
    T getMin();

    // get the maximum value from array
    T getMax();
}
