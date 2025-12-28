package exercises.oop2.ex1;

/**
 * 1. Exercise – Simple Inheritance: Person → Student
 * ------------------------
 * Create a Person class with:
 * - name
 * - age
 * - method introduce()
 * ------------------------
 * Create a Student class that inherits from Person and adds:
 * - studentNumber
 * ------------------------
 * In main, create a Student object and call the introduce() method.
 * ------------------------
 * Goal: understand basic inheritance and access to superclass attributes.
 */
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Mike", 39, 100);
        System.out.println("=== Student ===");

        student.introduce();
    }
}
