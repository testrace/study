package problem.step03;


import java.io.*;

public class Q15552 {


    public static final String CRLF = "\n";
    public static final String DELIMITER = " ";

    public static int[] solution(int x, String[] enter) {
        int[] answer = new int[x];

        for (int i = 0; i < x; i++) {
            answer[i] = plus(enter[i]);
        }
        return answer;
    }

    private static int plus(String s) {
        String[] strings = s.split(DELIMITER);
        return Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int first = Integer.parseInt(bufferedReader.readLine());
            String[] enter = new String[first];
            for (int i = 0; i < first; i++) {
                enter[i] = bufferedReader.readLine();
            }
            int[] solution = solution(first, enter);
            for (int i : solution) {
                bufferedWriter.write(i + CRLF);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
