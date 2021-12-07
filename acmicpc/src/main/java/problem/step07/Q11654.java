package problem.step07;

import java.io.*;

public class Q11654 {

    public static final String CRLF = "\n";

    public static int solution(String s) {
        return s.charAt(0);
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String n = br.readLine();
            int solution = solution(n);
            bw.write(solution + CRLF);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
