// simple class to show inheritance using generics
public class GenericInheritance {

    // main method - jvm calls this method
    public static void main(String[] args) {

    }
}

class GenericParent<T> {

    private T t;

    public GenericParent(T t) {
        this.t = t;
    }

    public T getT() {
        return this.t;
    }

    public void test() {
        System.out.println("inside generic parent");
    }
}

// child class of generic parent
class GenericChild<T, V> extends GenericParent<T> {

    // we can use v here
    private V v;

    public GenericChild(T t, V v) {
        super(t);
        this.v = v;
    }

    public V getV() {
        return this.v;
    }

    // override test
    public void test() {
        System.out.println("inside generic child");
    }
}


// non generic parent
class NonGenericParent {

}


// generic child class
class GenericChildNonGenericParent<T> extends NonGenericParent {

}
