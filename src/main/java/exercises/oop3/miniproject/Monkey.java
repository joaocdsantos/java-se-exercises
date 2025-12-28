package exercises.oop3.miniproject;

public class Monkey extends Animal implements Trainable {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes Uh uh ah ah!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eats fruit.");
    }

    @Override
    public void train() {
        System.out.println(getName() + " is being trained for tricks!");
    }
}
