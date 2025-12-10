package Math;

import java.util.Scanner;

public class _2745 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();
        int B = scanner.nextInt();
        long result = 0; // int → long으로 변경

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int value;

            if (c >= '0' && c <= '9') value = c - '0';
            else value = c - 'A' + 10;

            result = result * B + value;
        }

        System.out.println(result);
        scanner.close();
    }
}
