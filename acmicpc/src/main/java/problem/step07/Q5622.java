package problem.step07;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Q5622 {

    public static final String CRLF = "\n";

    private static final Map<Character, Integer> dictionary = new HashMap<>();

    static {
        dictionary.put('A', 3);
        dictionary.put('B', 3);
        dictionary.put('C', 3);
        dictionary.put('D', 4);
        dictionary.put('E', 4);
        dictionary.put('F', 4);
        dictionary.put('G', 5);
        dictionary.put('H', 5);
        dictionary.put('I', 5);
        dictionary.put('J', 6);
        dictionary.put('K', 6);
        dictionary.put('L', 6);
        dictionary.put('M', 7);
        dictionary.put('N', 7);
        dictionary.put('O', 7);
        dictionary.put('P', 8);
        dictionary.put('Q', 8);
        dictionary.put('R', 8);
        dictionary.put('S', 8);
        dictionary.put('T', 9);
        dictionary.put('U', 9);
        dictionary.put('V', 9);
        dictionary.put('W', 10);
        dictionary.put('X', 10);
        dictionary.put('Y', 10);
        dictionary.put('Z', 10);
    }

    public static int solution(String enter) {
        int answer = 0;
        for (int i = 0; i < enter.length(); i++) {
            answer += dictionary.get(enter.charAt(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String enter = br.readLine();
            int solution = solution(enter);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
