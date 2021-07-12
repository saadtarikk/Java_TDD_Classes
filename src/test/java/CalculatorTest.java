import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(5, 2);
    }
    @Test
    public void canAdd() {
        assertEquals(7, calculator.add(), 0.0);
    }

    @Test
    public void canSubtract() {
        assertEquals(3, calculator.subtract(), 0.0);
    }

    @Test
    public void canMultiply() {
        assertEquals(10, calculator.multiply(), 0.0);
    }

    @Test
    public void canDivide() {
        assertEquals(2.5, calculator.divide(), 0.0);
    }
}


//Calculator
//Create a Calculator class. This should have functions for Add,
// Subtract, Multiply and Divide. Your methods should take in two
// ints to perform the calculations on (except the Divide method.
// This should take two doubles as arguments).