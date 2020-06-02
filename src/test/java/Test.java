import java.util.List;
import org.junit.Assert;

public class Test {
    private final Double delta = 0.0;

    @org.junit.Test
    public void addition() {
        Assert.assertEquals(4, Calculator.calculateAnswer(List.of(2.0, 2.0), "+"), delta);
    }

    @org.junit.Test
    public void subtraction() {
        Assert.assertEquals(0, Calculator.calculateAnswer(List.of(2.0, 2.0), "-"), delta);
    }

    @org.junit.Test
    public void multiplication() {
        Assert.assertEquals(4, Calculator.calculateAnswer(List.of(2.0, 2.0), "*"), delta);
    }

    @org.junit.Test
    public void division() {
        Assert.assertEquals(1, Calculator.calculateAnswer(List.of(2.0, 2.0), "/"), delta);
    }

    @org.junit.Test
    public void divisionZeroTest() {
        Double resDiv = Calculator.calculateAnswer(List.of(2.0, 0.0), "/");
        Assert.assertTrue("Divide by zero gives infinity as result", Double.isInfinite(resDiv));
    }
}