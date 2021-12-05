package problem.step03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q10871 {

    public static final String SPACE = " ";

    public static int[] solution(int x, String arr) {
        List<Integer> answer = new ArrayList<>();

        String[] split = arr.split(SPACE);
        for (String s : split) {
            int num = Integer.parseInt(s);
            if (num < x) {
                answer.add(num);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String readLine = bufferedReader.readLine();
            String[] input = readLine.split(SPACE);
            int x = Integer.parseInt(input[1]);

            int[] solution = solution(x, bufferedReader.readLine());
            for (int s : solution) {
                bufferedWriter.write(s + SPACE);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
