package exercises.oop3.miniproject;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes Roaaaar!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats meat.");
    }
}