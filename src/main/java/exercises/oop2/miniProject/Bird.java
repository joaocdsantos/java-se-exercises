package exercises.oop2.miniProject;

public abstract class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public abstract void fly();
}
