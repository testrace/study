package nextstep.chapter02;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(9, 3));
        System.out.println(calculator.subtract(9, 3));
        System.out.println(calculator.multiply(9, 3));
        System.out.println(calculator.divide(9, 3));
    }

}
