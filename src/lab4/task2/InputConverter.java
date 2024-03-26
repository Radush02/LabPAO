package lab4.task2;

import lab4.task2.exceptions.UnknownOperandTypeException;

import java.util.ArrayList;
import java.util.List;

public class InputConverter {
    public static List<CalculatorRequest> mapRequests(String[] args) throws UnknownOperandTypeException {
        List<CalculatorRequest> cl = new ArrayList<>();
        for(int i=0;i<args.length;i+=3){
            try{
                if(args[i].equalsIgnoreCase("true") || args[i].equalsIgnoreCase("false")){
                    if(args[i+2].equalsIgnoreCase("true") || args[i+2].equalsIgnoreCase("false"))
                        cl.add(new CalculatorRequest(Boolean.parseBoolean(args[i]),Boolean.parseBoolean(args[i+2]),args[i+1]));
                }
                else if(args[i].contains(".") || args[i+2].contains(".")) {
                    cl.add(new CalculatorRequest(Double.parseDouble(args[i]),Double.parseDouble(args[i+2]),args[i+1]));
                }
                else
                    cl.add(new CalculatorRequest(Integer.parseInt(args[i]),Integer.parseInt(args[i+2]),args[i+1]));
            }
            catch(NumberFormatException e){
                System.err.println(e);
            }

        }
        return cl;
    }
}
