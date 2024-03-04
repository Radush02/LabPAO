package lab1.task4;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class DummyCalculator {
    public void calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        String cin = in.nextLine();
        while (!Objects.equals(cin, "quit")) {
            String[] op = cin.split(" ");
            if(op[0].equalsIgnoreCase("TRUE") && op[2].equalsIgnoreCase("TRUE"))
                System.out.println("Output: True");
            if(op[0].equalsIgnoreCase("FALSE") && op[2].equalsIgnoreCase("FALSE"))
                System.out.println("Output: False");
            else if(op[0].equalsIgnoreCase("TRUE")){
                if(op[2].equalsIgnoreCase("FALSE") && Objects.equals(op[1],"&"))
                    System.out.println("Output: False");
                else
                    System.out.println("Output: True");
            }
            else if(op[2].equalsIgnoreCase("TRUE")){
                if(op[0].equalsIgnoreCase("FALSE") && Objects.equals(op[1],"&"))
                    System.out.println("Output: False");
                else
                    System.out.println("Output: True");
            }
            else
                try {
                    int a = parseInt(op[0]);
                    int b = parseInt(op[2]);
                    switch (op[1].charAt(0)){
                        case '+':
                            System.out.println("Output: " + (a + b));
                            break;
                        case '-':
                            System.out.println("Output: " + (a - b));
                            break;
                        case '/':
                            System.out.println("Output: " + ((float)(a) / b));
                            break;
                        case '*':
                            System.out.println("Output: " + (a * b));
                            break;
                    }
                }
                catch (Exception e) {
                    Double a = parseDouble(op[0]);
                    Double b = parseDouble(op[2]);
                    switch (op[1].charAt(0)){
                        case '+':
                            System.out.println("Output: " + (a + b));
                            break;
                        case '-':
                            System.out.println("Output: " + (a - b));
                            break;
                        case '/':
                            System.out.println("Output: " + (a / b));
                            break;
                        case '*':
                            System.out.println("Output: " + (a * b));
                            break;
                    }
                }
            System.out.println("Input: ");
            cin = in.nextLine();
        }
    }
}
