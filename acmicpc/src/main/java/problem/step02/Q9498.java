package problem.step02;

import java.util.Arrays;
import java.util.Scanner;

public class Q9498 {

    enum Rank {
        A(100, 90),
        B(89, 80),
        C(79, 70),
        D(69, 60),
        F(59, 0);

        private final int max;
        private final int min;

        Rank(int max, int min) {
            this.max = max;
            this.min = min;
        }

        static Rank of(int score) {
            return Arrays.stream(values())
                    .filter(rank -> between(score, rank))
                    .findFirst()
                    .orElse(F);
        }

        private static boolean between(int score, Rank rank) {
            return rank.max >= score && rank.min <= score;
        }
    }

    public static String solution(int score) {
        return Rank.of(score)
                .name();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            System.out.print(solution(first));
        }
    }
}
