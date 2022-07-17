package nextstep.chapter02;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        add(calculator);
        subtract(calculator);
        multiply(calculator);
        divide(calculator);
    }

    private static void add(Calculator calculator) {
        System.out.println(calculator.add(9, 3));
    }

    private static void subtract(Calculator calculator) {
        System.out.println(calculator.subtract(9, 3));
    }

    private static void multiply(Calculator calculator) {
        System.out.println(calculator.multiply(9, 3));
    }

    private static void divide(Calculator calculator) {
        System.out.println(calculator.divide(9, 3));
    }

}
