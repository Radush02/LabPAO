package lab4.task3;

import java.util.HashMap;
import java.util.Map;

public class Student implements Cloneable {
    private String fullName;
    private Map<String, Double> courseInformation;
    public Student(String fullName, Map<String, Double> courseInformation) {
        this.fullName = fullName;
        this.courseInformation = new HashMap<>(courseInformation);
    }
    @Override
    public Student clone() {
        try {
            Student c = (Student) super.clone();
            c.courseInformation = new HashMap<>(this.courseInformation);
            return c;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    @Override
    public String toString() {
        return fullName+" "+courseInformation;
    }
}
