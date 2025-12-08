package Math;

import java.util.Scanner;

public class _2745 {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄에서 N(B진법 수)과 B(진법)를 공백으로 구분하여 입력 받음
        String N = scanner.next();
        int B = scanner.nextInt();

        // 10진수 결과를 저장할 변수 (결과가 10억 이하이므로 int 또는 long 사용 가능)
        long decimalValue = 0;

        // B의 거듭제곱(B^0, B^1, B^2, ...)을 저장할 변수. 가장 낮은 자릿수부터 시작하므로 1로 초기화
        long powerOfB = 1;

        // B진법 수 N의 문자열을 가장 낮은 자릿수(오른쪽 끝)부터 순회
        for (int i = N.length() - 1; i >= 0; i--) {
            char digit = N.charAt(i);
            int digitValue = 0; // 현재 자릿수의 10진수 값 (0 ~ 35)

            // 1. 자릿값(digit)을 10진수 값으로 변환
            if (digit >= '0' && digit <= '9') {
                // 0부터 9 사이의 숫자
                digitValue = digit - '0';
            } else if (digit >= 'A' && digit <= 'Z') {
                // A부터 Z 사이의 알파벳 (A=10, B=11, ...)
                digitValue = (digit - 'A') + 10;
            }

            // 2. 10진수 결과에 '자릿값 * B의 거듭제곱'을 더함
            decimalValue += digitValue * powerOfB;

            // 3. 다음 자릿수를 위해 B의 거듭제곱을 업데이트
            // (다음 자릿수는 현재 자릿값보다 B배 더 큰 자릿값을 가짐)
            powerOfB *= B;
        }

        // 결과 출력
        System.out.println(decimalValue);

        scanner.close();
    }
}
