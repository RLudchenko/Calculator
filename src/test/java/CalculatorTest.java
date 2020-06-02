import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Double delta = 0.0;

    @Test
    public void addition() {
        Assert.assertEquals(4, Calculator.calculateAnswer(List.of(2.0, 2.0), "+"), delta);
    }

    @Test
    public void subtraction() {
        Assert.assertEquals(0, Calculator.calculateAnswer(List.of(2.0, 2.0), "-"), delta);
    }

    @Test
    public void multiplication() {
        Assert.assertEquals(4, Calculator.calculateAnswer(List.of(2.0, 2.0), "*"), delta);
    }

    @Test
    public void division() {
        Assert.assertEquals(1, Calculator.calculateAnswer(List.of(2.0, 2.0), "/"), delta);
    }

    @Test
    public void divisionZeroTest() {
        Double resDiv = Calculator.calculateAnswer(List.of(2.0, 0.0), "/");
        Assert.assertTrue("Divide by zero gives infinity as result", Double.isInfinite(resDiv));
    }

    @Test
    public void powerTest() {
        Assert.assertEquals(4, Calculator.calculateAnswer(List.of(2.0, 2.0), "^"), delta);
    }

    @Test(expected = NoSuchElementException.class)
    public void incorrectChar() {
        Assert.assertEquals(4, Calculator.calculateAnswer(List.of(2.0, 2.0), "#"), delta);
    }
}
