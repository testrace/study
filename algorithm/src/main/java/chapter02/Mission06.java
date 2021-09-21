package chapter02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mission06 {

    public static String solution(String num, String str) {
        List<String> answer = new ArrayList<>();

        int cnt = Integer.parseInt(num);
        String[] split = str.split(" ");
        for (String s : split) {
            long number = Long.parseLong(s);
            long reverse = 0;
            while (number > 0) {
                long tmp = number % 10;
                reverse = reverse * 10 + tmp;
                number = number / 10;
            }
            if (isPrime(reverse)) {
                answer.add(String.valueOf(reverse));
            }
        }

        return String.join(" ", answer);
    }

    public static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i*i <= number; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cnt = scanner.nextLine();
        String str = scanner.nextLine();

        String solution = Mission06.solution(cnt, str);
        System.out.println(solution);
    }

}
