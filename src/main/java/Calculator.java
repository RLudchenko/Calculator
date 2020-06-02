import java.util.Arrays;

public class Calculator {
    static Double calculateAnswer(Double x, Double y, String operator) {
        return Arrays.stream(Operations.values())
                .filter(op -> op.getSymbol().equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String
                        .format("Operation '%s' is not supported", operator)))
                .getResult(x, y);
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
