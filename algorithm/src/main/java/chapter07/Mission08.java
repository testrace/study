package chapter07;

import java.util.*;

public class Mission08 {

    public static int solution(int s, int e) {
        int answer = 0;
        Deque<Integer> q = new ArrayDeque<>();
        int[] move = new int[]{1, -1, 5};
        for (int i : move) {
            q.offer(i);
        }
        while (!q.isEmpty()) {
            int size = q.size();
            int[] cache = new int[3];
            for (int i = 0; i < size; i++) {
                Integer poll = q.poll();
                cache[i] = Math.abs(e - (s + poll));
            }
            int tmp = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < cache.length; i++) {
                if (cache[i] == 0) {
                    tmp = move[i];
                    break;
                }
                if (cache[i] < min) {
                    min = cache[i];
                    tmp = move[i];
                }
            }
            s += tmp;
            answer++;
            if (s != e) {
                for (int i : move) {
                    q.offer(i);
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();

        int solution = Mission08.solution(s, e);
        System.out.println(solution);
    }

}



