import java.util.Arrays;
import java.util.List;

public class Calculator {
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
