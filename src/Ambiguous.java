// A simple class to show ambiguity while using generics
// to avoid ambiguity simply change the method name
public class Ambiguous<T, V> {

    // an instance variable of type t
    private T t;

    // an instance variable of type v
    private V v;

    // set the value of t
    public void set(T t) {
        this.t = t;
    }

    // set the value of v
    // uncomment the following lines to see ambiguity in action
//    public void set(V v) {
//        this.v = v;
//    }
}
