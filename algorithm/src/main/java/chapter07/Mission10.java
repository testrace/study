package chapter07;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Mission10 {

    public static int solution(int s, int e) {
        int answer = 0;
        Deque<Integer> q = new LinkedList<>();
        int cnt = 1;
        q.offer(cnt++);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer poll = q.poll();
                if (poll == e) {
                    return answer;
                }
                if (cnt <= s) {
                    q.offer(cnt++);
                    q.offer(cnt++);
                }
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();

        int solution = Mission10.solution(s, e);
        System.out.println(solution);
    }

}



