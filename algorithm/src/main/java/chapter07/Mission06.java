package chapter07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mission06 {

    public static List<String> solution(int n) {
        List<String> list = new ArrayList<>();
        int[] cache = new int[n+1];

        dfs(1, n, cache, list);

        return list;
    }

    private static void dfs(int l, int n, int[] cache, List<String> list) {
        if (l == n + 1) {
            StringBuilder a = new StringBuilder();
            for (int i = 1; i < cache.length; i++) {
                if (cache[i] > 0) {
                    a.append(i);
                    a.append(" ");
                }
            }
            if (!a.toString().isEmpty()) {
                list.add(a.toString().trim());
            }
        } else {
            cache[l] = 1;
            dfs(l+1, n, cache, list);
            cache[l] = 0;
            dfs(l+1, n, cache, list);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<String> solution = Mission06.solution(n);
        for (String s : solution) {
            System.out.println(s);
        }
    }

}



