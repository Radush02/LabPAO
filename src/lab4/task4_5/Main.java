package lab4.task4_5;

public class Main {
    public static void foo() {
        try {
            System.out.println("1");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("2");
        } finally {
            System.out.println("3");
        }
    }
    public static void bar() {
        try {
            throw new ClassCastException();
        }
        catch(ClassCastException e){
            System.out.println("prins: "+e);
        }
        catch (RuntimeException e) {
            System.out.println("fail");
        }
    }
    public static void main(String args[]){
        bar();
    }
}
