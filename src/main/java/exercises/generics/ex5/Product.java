package exercises.generics.ex5;

public class Product implements Identifiable<String> {

    private String id;

    public Product(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}