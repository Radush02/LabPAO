package lab1.task2;

public class Student {
    private String name;
    private double grade;
    public Student(String name,double grade){
        this.grade=grade;
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+' '+grade;
    }
}
