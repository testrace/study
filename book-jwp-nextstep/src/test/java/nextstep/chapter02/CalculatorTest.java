package nextstep.chapter02;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(6, 3));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.subtract(6, 3));
    }

}
