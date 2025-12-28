package exercises.generics.ex1;

public class Box<T> {

    private T value;

    public void store(T newValue) {
        this.value = newValue;
    }

    public T retrive() {
        return value;
    }
}