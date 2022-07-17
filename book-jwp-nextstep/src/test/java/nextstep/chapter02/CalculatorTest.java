package nextstep.chapter02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.add(6, 3));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(6, 3));
    }

}
