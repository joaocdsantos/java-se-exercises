package exercises.oop2.ex1;

public class Student extends Person {

    private final int studentNumber;

    public Student(String name, int age, int studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" | Numero de aluno: " + this.getStudentNumber());
    }
}
