package chapter05;

import java.util.*;

public class Mission03 {

    public static int solution(int n, int[][] board, int cnt, int[] moves) {
        int answer = 0;

        ArrayDeque<Integer> basket = new ArrayDeque<>();
        List<Deque<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayDeque<>());
        }

        for (int i = n - 1 ; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int e = board[i][j];
                if (e > 0) {
                    Deque<Integer> deque = list.get(j);
                    deque.add(e);
                }
            }
        }

        for (int i = 0; i < cnt; i++) {
            Deque<Integer> deque = list.get(moves[i] - 1);
            if (deque.isEmpty()) {
                continue;
            }
            Integer pop = deque.removeLast();
            Integer basketLast = basket.peekLast();
            if (Objects.equals(basketLast, pop)) {
                basket.removeLast();
                answer += 2;
            } else {
                basket.add(pop);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int cnt = scanner.nextInt();
        int[] moves = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            moves[i] = scanner.nextInt();
        }

        int solution = Mission03.solution(n, board, cnt, moves);
        System.out.println(solution);
    }
}
