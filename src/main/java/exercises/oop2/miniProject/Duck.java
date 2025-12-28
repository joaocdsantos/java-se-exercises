package exercises.oop2.miniProject;

public class Duck extends Bird {

    public Duck(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Quack quack!");
    }

    @Override
    public void fly() {
        System.out.println("Action: The duck is flying!");
    }
}
