package exercises.oop1.ex2;


public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
            return;
        }
        this.age = age;

    }

    @Override
    public String toString() {
        return "Name: " + name + " | Age: " + age;
    }
}
