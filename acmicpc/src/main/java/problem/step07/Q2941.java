package problem.step07;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Q2941 {

    public static final String CRLF = "\n";

    private static final Set<String> dictionary = new TreeSet<>();

    static {
        dictionary.add("c=");
        dictionary.add("c-");
        dictionary.add("dz=");
        dictionary.add("d-");
        dictionary.add("lj");
        dictionary.add("nj");
        dictionary.add("s=");
        dictionary.add("z=");
    }

    public static int solution(String enter) {

        for (String s : dictionary) {
            enter = enter.replaceAll(s, "a");
        }

        return enter.length();
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
