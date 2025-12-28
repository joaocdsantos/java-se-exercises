package exercises.oop1.miniproject;

import java.util.ArrayList;

public class SchoolClass {

    private ArrayList<Student> studentList = new ArrayList<>();
    private Professor professor;


    public SchoolClass(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void listStudents() {
        System.out.println("\n=== Students List ===");
        for (Student e : studentList) {
            e.showInfo();
        }
    }

    public void showProfessor() {
        System.out.println("=== Professor ===");
        getProfessor().showInfo();
    }
}
