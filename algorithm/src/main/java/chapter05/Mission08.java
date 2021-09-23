package chapter05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Mission08 {

    public static int solution(int n, int m, int[] enter) {
        int answer = 0;
        Deque<Data> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.offer(new Data(i, enter[i]));
        }

        while (!stack.isEmpty()) {
            Data poll = stack.poll();
            for (Data data : stack) {
                if (poll.value < data.value) {
                    stack.offer(poll);
                    poll = null;
                    break;
                }
            }
            if (poll != null) {
                answer++;
                if (poll.idx == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    static class Data {
        public int idx;
        public int value;

        public Data(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        int solution = Mission08.solution(n, m, enter);
        System.out.println(solution);
    }

}


