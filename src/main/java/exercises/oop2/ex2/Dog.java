package exercises.oop2.ex2;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("The dog barks!");
    }
}
