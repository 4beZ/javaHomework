import java.io.Serializable;

public class Parametric <T extends Comparable, V extends Serializable, Animal, K>{
    T t;
    V v;
    K k;

    Parametric (T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT () {
        return t;
    }

    public V getV () {
        return v;
    }

    public K getK () {
        return k;
    }

    public void getNames () {
        System.out.println(t.getClass().getSimpleName() + " " + v.getClass().getSimpleName() + " " + k.getClass().getSimpleName());
    }
}
