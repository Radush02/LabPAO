package lab4.task2.exceptions;

public abstract class CalculatorRuntimeException extends RuntimeException {
    public CalculatorRuntimeException(String msj) {
        super(msj);
    }
}