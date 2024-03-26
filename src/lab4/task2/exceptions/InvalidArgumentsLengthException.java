package lab4.task2.exceptions;

public class InvalidArgumentsLengthException extends CalculatorRuntimeException{
    public InvalidArgumentsLengthException(String msg){
        super(msg);
    }
}