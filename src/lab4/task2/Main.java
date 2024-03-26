package lab4.task2;

import lab4.task2.exceptions.InvalidOperationException;
import lab4.task2.exceptions.UnknownOperandTypeException;

import java.util.List;

public final class Main {
    public static void foo(String[] args) throws InvalidOperationException, UnknownOperandTypeException {
        List<CalculatorResult> calculationResults =  SmarterCalculator.calculate(args);
        for (CalculatorResult result : calculationResults) {
            try{
            CalculatorRequest request = result.getRequest();
            System.out.println("Operation " + request + " has result " + result.computeResult());}
            catch(InvalidOperationException e){
                System.err.println(e);
            }
        }
    }

    public static void main(String[] args) throws InvalidOperationException, UnknownOperandTypeException {

        foo(new String[]{"1", "+", "2",
                "abc", "*", "5",
                "1", "+", "5.0",
                "1.0", "-", "2",
                "10.0", "/", "1",
                "true", "|", "false",
                "true", "+", "true",
                "true", "&", "false"});
    }
}
