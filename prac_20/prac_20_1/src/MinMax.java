import java.util.ArrayList;
import java.util.Comparator;

public class MinMax<T extends Comparable> {
    ArrayList<T> mas;

    MinMax (ArrayList<T> mas) {
        this.mas = mas;
    }

    public T findMax () {
        T max = mas.get(0);
        for (T el : mas) {
            if (el.compareTo(max) > 0)
                max = el;
        }
        return max;
    }

    public T findMin () {
        T min = mas.get(0);
        for (T el : mas) {
            if (el.compareTo(min) < 0)
                min = el;
        }
        return min;
    }
}
