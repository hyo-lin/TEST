package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 개수는 int여도 됩니다.
        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            // [오류 1 수정] Integer.parseInt -> Long.parseLong
            long num = Long.parseLong(bf.readLine());

            if (num < 2) {
                System.out.println(2);
                continue;
            }

            while (true) {
                if (isPrime(num)) {
                    System.out.println(num);
                    break; // [오류 2 수정] continue -> break
                }
                num++;
            }
        }
    } // main 끝

    // [오류 3 수정] 함수는 main 밖으로 꺼내야 합니다.
    // [오류 4 수정] 매개변수 타입(long n) 명시
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        // [오류 5 수정] i도 long으로 하는 것이 안전합니다.
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}