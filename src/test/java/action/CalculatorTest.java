package action;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(7, calc.add(2, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(10, calc.subtract(12, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(10, calc.multiply(2, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, calc.division(5, 2));
    }
}