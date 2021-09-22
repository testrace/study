package chapter04;

import java.util.*;

public class Mission03 {

    public static String solution(int n, int k, int[] enter) {
        List<String> answer = new ArrayList<>();
        Map<Integer, Integer> repo = new HashMap<>();
        int left = 0;

        for (int i = 0; i < n; i++) {
            repo.put(enter[i], repo.getOrDefault(enter[i], 0) + 1);
            while (i - left == k - 1) {
                answer.add(String.valueOf(repo.size()));
                if (repo.get(enter[left]) == 1) {
                    repo.remove(enter[left]);
                } else {
                    repo.put(enter[left], repo.get(enter[left]) - 1);
                }
                left++;
            }
        }

        return String.join(" ", answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] enter = new int[n];
        for (int i = 0; i < n; i++) {
            enter[i] = scanner.nextInt();
        }

        String solution = Mission03.solution(n, k, enter);
        System.out.println(solution);
    }
}
