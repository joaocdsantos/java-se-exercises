package exercises.oop2.miniProject;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Roar!");
    }
}
