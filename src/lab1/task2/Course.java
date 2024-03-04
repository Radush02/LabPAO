package lab1.task2;
import java.util.Random;
public class Course {
    private String name;
    private double minimumGrade;
    private Student[] students;
    public Course(String name,double minimumGrade, Student[] students){
        this.name=name;
        this.minimumGrade=minimumGrade;
        this.students=students;
    }
    public Student chooseStudentRandomly(){
        Random rand = new Random();
        return students[rand.nextInt(students.length-1)];
    }
    public Student[] showAllPassingStudents(){
        int size=0,pos=0;
        for (Student student : students) {
            if (student.getGrade() >= minimumGrade)
                size++;
        }
        Student[] s = new Student[size];
        for (Student student : students)
            if (student.getGrade() >= minimumGrade) {
                s[pos++] = student;
                System.out.println(student.toString());
            }
        return s;
    }
    public boolean isStudentPassing(Student s){
        return s.getGrade()>=minimumGrade;
    }
    public boolean isStudentPassing(int idx){
        return students[idx].getGrade()>=minimumGrade;
    }
}
