import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean runAgain = false;
        List<Double> inputs = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        inputs.add(scanner.nextDouble());
        System.out.print("Enter the second number : ");
        inputs.add(scanner.nextDouble());
        System.out.print("Enter the operator : ");
        String op = scanner.next();
        Double result = .0;

        result = calculateAnswer(inputs, op);
        System.out.println("Answer : " + result);

        System.out.println("Program finished!");
        scanner.close();
    }

    static Double calculateAnswer(List<Double> inputs, String operator) {
        Operations[] ops = Operations.values();
        Operations correctOp = Arrays.asList(ops).stream()
                .filter(op -> op.getSymbol().equals(operator))
                .findFirst().get();

        return correctOp.getResult(inputs.get(0), inputs.get(1));
    }

    enum Operations {
        ADD() {
            @Override
            String getSymbol() {
                return "+";
            }

            @Override
            Double getResult(Double d1, Double d2) {
                return d1 + d2;
            }
        },SUB {
            @Override
            String getSymbol() {
                return "-";
            }

            @Override
            Double getResult(Double d1, Double d2) {
                return d1 - d2;
            }
        },MUL {
            @Override
            String getSymbol() {
                return "*";
            }

            @Override
            Double getResult(Double d1, Double d2) {
                return d1 * d2;
            }
        },DIV {
            @Override
            String getSymbol() {
                return "/";
            }

            @Override
            Double getResult(Double d1, Double d2) {
                return d1 / d2;
            }
        }, POW {
            @Override
            String getSymbol() {
                return "^";
            }

            @Override
            Double getResult(Double d1, Double d2) {
                return Math.pow(d1, d2);
            }
        };
        abstract Double getResult(Double d1, Double d2);

        abstract String getSymbol();
    }
}
