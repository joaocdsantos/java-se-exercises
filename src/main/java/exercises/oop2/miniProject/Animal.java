package exercises.oop2.miniProject;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();

    public void showInfo() {
        System.out.println("Animal: " + getName() + " (" + getAge() + " years old)");
    }
}
