package exercises.oop1.miniproject;

public class Student extends Person {

    private int studentNumber;
    private double averageGrade;

    public Student(String name, int age, int studentNumber, double averageGrade) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.averageGrade = averageGrade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void showInfo() {
        System.out.print("Nome: " + getName() + " | Student Number : " + getStudentNumber() + " | Age: " + getAge());
        System.out.printf(" | Average: %.2f%n", getAverageGrade());
    }
}
