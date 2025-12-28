package exercises.generics.ex5;

public class Person implements Identifiable<Integer> {

    private int id;

    public Person(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }
}