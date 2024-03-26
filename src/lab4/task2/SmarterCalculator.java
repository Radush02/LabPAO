package lab4.task2;

import lab4.task2.exceptions.InvalidArgumentsLengthException;
import lab4.task2.exceptions.UnknownOperandTypeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class SmarterCalculator {
    public static List<CalculatorResult> calculate(String[] args) throws UnknownOperandTypeException {
        InputConverter inputConverter = new InputConverter();
        List<CalculatorResult> rez = new ArrayList<>();
        if(args.length % 3 != 0 && args.length>0)
            throw new InvalidArgumentsLengthException("Nr. de arg. invalid.");
        for(int i = 0; i <args.length; i+=3){
            List<CalculatorRequest> l = (inputConverter.mapRequests(new String[]{args[i], args[i + 1], args[i + 2]}));

            for(CalculatorRequest a : l){
                try{
                    switch (a.getRequestType()) {
                        case "Integer":
                            rez.add(new IntegerCalculatorResult(a));
                            break;
                        case "Double":
                            rez.add(new DoubleCalculatorResult(a));
                            break;
                        case "Boolean":
                            rez.add(new BooleanCalculatorResult(a));
                            break;
                    }
                }catch(UnknownOperandTypeException e){
                    System.err.println(e);
                }

            }
        }
        return rez;
    }
}
