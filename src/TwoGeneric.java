// generic class with two type parameters
public class TwoGeneric<T, V> {

    // local variable of type t
    private T t;

    // local variable of type v
    private V v;

    // constructor
    // initialize local variables
    public TwoGeneric(T t, V v) {
        this.t = t;
        this.v = v;
    }

    // get value of t
    public T getT() {
        return this.t;
    }

    // get value of v
    public V getV() {
        return this.v;
    }
}
