import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private static final Double DELTA = 0.0;

    @Test
    public void addition() {
        Assert.assertEquals(4, Calculator.calculateAnswer(2.0, 2.0, "+"), DELTA);
    }

    @Test
    public void subtraction() {
        Assert.assertEquals(0, Calculator.calculateAnswer(2.0, 2.0, "-"), DELTA);
    }

    @Test
    public void multiplication() {
        Assert.assertEquals(4, Calculator.calculateAnswer(2.0, 2.0, "*"), DELTA);
    }

    @Test
    public void division() {
        Assert.assertEquals(1, Calculator.calculateAnswer(2.0, 2.0, "/"), DELTA);
    }

    @Test
    public void divisionZeroTest() {
        Double resDiv = Calculator.calculateAnswer(2.0, 0.0, "/");
        Assert.assertTrue("Operation '%s' is not supported", Double.isInfinite(resDiv));
    }

    @Test
    public void powerTest() {
        Assert.assertEquals(4, Calculator.calculateAnswer(2.0, 2.0, "^"), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWrongOperation() {
        Calculator.calculateAnswer(1.0, 2.0, "%");
    }
}
