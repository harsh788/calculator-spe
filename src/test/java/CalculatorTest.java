import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setup() {calculator = new Main();}

    @Test
    public void test_add_positive() {
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b));
    }

    @Test
    public void test_add_negative() {
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }

    @Test
    public void test_sub_positive() {
        int a = 1;
        int b = 2;
        int expectedResult = -1;
        Assert.assertEquals(expectedResult, calculator.subtract(a, b));
    }

    @Test
    public void test_sub_negative() {
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.subtract(a, b));
    }

    @Test
    public void test_mul_positive() {
        int a = 1;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.multiply(a, b));
    }

    @Test
    public void test_mul_negative() {
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.multiply(a, b));
    }

    @Test
    public void test_div_positive() {
        int a = 10;
        int b = 2;
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, calculator.divide(a, b));
    }

    @Test
    public void test_div_negative() {
        int a = 10;
        int b = 2;
        int expectedResult = 4;
        Assert.assertNotEquals(expectedResult, calculator.divide(a, b));
    }
}
