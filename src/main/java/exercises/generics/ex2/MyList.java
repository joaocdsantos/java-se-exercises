package exercises.generics.ex2;

import java.util.ArrayList;

/**
 * Generic class that stores up to 5 elements.
 * @param <T> the type of data stored
 */
public class MyList<T> {

    private ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        if (size() >= 5) {
            throw new ArrayIndexOutOfBoundsException(
                    "List limit reached — maximum of 5 elements allowed."
            );
        }
        list.add(value);
    }

    public int size() {
        return list.size();
    }


    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException(
                    "Invalid index — must be between 0 and " + (size() - 1)
            );
        }
        return list.get(index);
    }
}