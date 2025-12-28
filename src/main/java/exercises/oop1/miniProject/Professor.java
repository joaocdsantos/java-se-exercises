package exercises.oop1.miniProject;

public class Professor extends Person {

    private String subject;
    private double salary;

    public Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void showInfo() {
        System.out.print("Name: " + getName() + " | Subject: " + getSubject() + " | Age: " + getAge());
        System.out.printf(" | Salary: %.2f€%n",getSalary());
    }
}
