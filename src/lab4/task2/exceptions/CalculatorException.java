package lab4.task2.exceptions;

public abstract class CalculatorException extends Exception {
    public CalculatorException(String msj) {
        super(msj);
    }
}