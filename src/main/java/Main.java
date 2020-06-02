import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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

        result = Calculator.calculateAnswer(inputs, op);
        System.out.println("Answer : " + result);

        System.out.println("Program finished!");
        scanner.close();
    }
}
