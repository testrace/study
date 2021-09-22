package chapter04;

import java.util.*;

public class Mission04 {

    public static int solution(String first, String second) {
        int answer = 0;
        Map<Character, Integer> repo = new HashMap<>();
        Map<Character, Integer> secondRepo = new HashMap<>();

        char[] firsts = first.toCharArray();
        char[] seconds = second.toCharArray();
        for (char value : seconds) {
            secondRepo.put(value, secondRepo.getOrDefault(value, 0) + 1);
        }

        int lt = 0;
        for (int i = 0; i < seconds.length - 1; i++) {
            repo.put(firsts[i], repo.getOrDefault(firsts[i], 0) + 1);
        }

        for (int i = seconds.length - 1; i < firsts.length; i++) {
            repo.put(firsts[i], repo.getOrDefault(firsts[i], 0) + 1);
            if (repo.equals(secondRepo)) {
                answer++;
            }
            if (repo.get(firsts[lt]) == 1) {
                repo.remove(firsts[lt]);
            } else {
                repo.put(firsts[lt], repo.get(firsts[lt]) - 1);
            }

            lt++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String k = scanner.nextLine();

        int solution = Mission04.solution(n, k);
        System.out.println(solution);
    }
}
