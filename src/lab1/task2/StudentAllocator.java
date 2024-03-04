package lab1.task2;
import java.util.Random;

public class StudentAllocator {
    public static Student[] createStudents(int noStudents){
        Student[] s = new Student[noStudents];
        for(int i=0;i<noStudents;i++){
            Random rand = new Random();
            s[i]=new Student("Student "+(i+1),(300d+Math.round(Math.random() * 700d) )/ 100d);
        }
        return s;
    }
}
