package lab1.task1;
import lab1.task2.Student;
import lab1.task2.Course;
import lab1.task2.StudentAllocator;
import lab1.task4.DummyCalculator;
public class Main {
    public static void main(String[] args) {
        Student[] students = StudentAllocator.createStudents(10);
        Course c = new Course("PAO",5.0,students);
        //ex1
        System.out.println("Student Random:"+c.chooseStudentRandomly());
        //ex2
        Student[] s2 = c.showAllPassingStudents();
        System.out.println(c.isStudentPassing(students[0]));
        System.out.println(c.isStudentPassing(1));
//
//        DummyCalculator dc = new DummyCalculator();
//        dc.calculate();
    }
}