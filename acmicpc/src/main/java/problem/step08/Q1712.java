package problem.step08;

import java.io.*;

public class Q1712 {

    public static final String CRLF = "\n";
    public static final String SPACE = " ";

    public static int solution(String enter) {
        String[] amounts = enter.split(SPACE);

        int a = Integer.parseInt(amounts[0]);
        int b = Integer.parseInt(amounts[1]);
        int c = Integer.parseInt(amounts[2]);

        if ((c - b) <= 0) {
            return -1;
        }

        return (a / (c - b)) + 1;
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
