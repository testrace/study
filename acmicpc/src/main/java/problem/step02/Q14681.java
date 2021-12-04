package problem.step02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Q14681 {

    enum Quadrant {
        ONE(1,Quadrant::isPositive, Quadrant::isPositive),
        TWO(2, Quadrant::isNegative, Quadrant::isPositive),
        THREE(3, Quadrant::isNegative, Quadrant::isNegative),
        FOUR(4,Quadrant::isPositive, Quadrant::isNegative);

        private final int value;
        private final IntPredicate xPositive;
        private final IntPredicate yPositive;


        Quadrant(int value, IntPredicate x, IntPredicate y) {
            this.value = value;
            this.xPositive = x;
            this.yPositive = y;
        }

        public static Quadrant valueOf(int x, int y) {
            return Arrays.stream(values())
                    .filter(quadrant -> match(quadrant.xPositive, x))
                    .filter(quadrant -> match(quadrant.yPositive, y))
                    .findFirst()
                    .orElse(ONE);
        }

        private static boolean match(IntPredicate predicate, int x) {
            return predicate.test(x);
        }

        private static boolean isPositive(int x) {
            return x > 0;
        }

        private static boolean isNegative(int x) {
            return x < 0;
        }
    }

    public static int solution(int x, int y) {
        return Quadrant.valueOf(x, y).value;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.print(solution(first, second));
        }
    }
}
