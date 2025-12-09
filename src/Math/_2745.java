package Math;

import java.util.Scanner;

public class _2745 {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄에서 N(B진법 수)과 B(진법)를 공백으로 구분하여 입력 받음
        String N = scanner.next();
        int B = scanner.nextInt();
        int result=0;

        for(int i=0; i<N.length(); i++){
            char c=N.charAt(i);
            int value;

            if(c>='0' && c<='9') value = c - '0';
            else value=c-'A'+10;

            result=result*B+value;
        }
        System.out.println(result);


        scanner.close();
    }
}
