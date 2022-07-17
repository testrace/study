package nextstep.chapter02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("setUp");
    }

    @Test
    void add() {
        assertEquals(9, calculator.add(6, 3));
        System.out.println("add");
    }

    @Test
    void subtract() {
        assertEquals(3, calculator.subtract(6, 3));
        System.out.println("subtract");
    }

    @AfterEach
    void teardown() {
        System.out.println("teardown");
    }
}
