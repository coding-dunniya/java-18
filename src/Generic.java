// a very simple generic class
// t is the data type
// if t is int - logic is applied on integers
// if t is string - logic is applied on string
public class Generic<T> {

    // we can use this t in this class anywhere
    // declare variables
    // a variable of type t
    private T t;

    // constructor -- initialize value of local variable t
    public Generic(T t) {
        this.t = t;
    }

    // get the value of t
    public T getT() {
        return this.t;
    }

    // use wildcard arguments here --> ?
    public void test(GenericAnother<?> ga) {
        // nothing
    }
}

// another generic class to demonstrate wildcard arguments
class GenericAnother<T> {

    // instance variable of type t
    private T t;

    // constructor
    public GenericAnother(T t) {
        this.t = t;
    }

    // get the value of t
    public T getT() {
        return this.t;
    }
}