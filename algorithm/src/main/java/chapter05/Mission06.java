package chapter05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Scanner;

public class Mission06 {

    public static int solution(int n, int k) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            stack.offer(i);
        }
        while (stack.size() > 1) {
            for (int i = 1; i < k; i++) {
                stack.offer(Objects.requireNonNull(stack.poll()));
            }
            stack.poll();
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int solution = Mission06.solution(n, k);
        System.out.println(solution);
    }

}
