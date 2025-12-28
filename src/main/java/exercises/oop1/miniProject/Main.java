package exercises.oop1.miniProject;

/**
 * School System — Mini Project
 * Create the following classes:
 * --------------------------------
 * 1. Person (superclass)
 * - private fields: name, age
 * - getters and setters
 * --------------------------------
 * 2. Student (subclass)
 * - studentNumber
 * - averageGrade
 * - method: showInfo()
 * --------------------------------
 * 3. Professor (subclass)
 * - subject
 * - salary
 * - method: showInfo()
 * --------------------------------
 * 4. SchoolClass
 * - list of students (ArrayList)
 * - professor
 * - methods:
 *      addStudent()
 *      listStudents()
 *      showProfessor()
 * --------------------------------
 * Final Objective:
 * Create an application with main() that:
 *  - Creates a professor
 *  - Creates multiple students
 *  - Adds the students to the class
 *  - Prints the complete class information
 */
public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor("Joaquim Rocha", 45, "Mathematics", 2000);

        SchoolClass schoolClass = new SchoolClass(professor);

        Student student1 = new Student("João", 18, 101, 19.5);
        Student student2 = new Student("Carlos", 19, 102, 15.0);
        Student student3 = new Student("Dias", 19, 102, 11.0);
        Student student4 = new Student("Santos", 20, 103, 16.8);

        schoolClass.addStudent(student1);
        schoolClass.addStudent(student2);
        schoolClass.addStudent(student3);
        schoolClass.addStudent(student4);

        schoolClass.showProfessor();
        schoolClass.listStudents();
    }
}
