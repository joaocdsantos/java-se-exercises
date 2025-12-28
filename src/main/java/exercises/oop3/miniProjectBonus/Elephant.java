package exercises.oop3.miniProjectBonus;

public class Elephant extends Animal implements Trainable {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes Fuuuuuh!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats plants.");
    }

    @Override
    public void train() {
        System.out.println(getName() + " is being trained for shows!");
    }

}
