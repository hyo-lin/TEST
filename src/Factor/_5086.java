package Factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5086 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            // 한 줄을 읽고 공백으로 나눕니다.
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 0 0 이 입력되면 종료
            if (A == 0 && B == 0) break;

            if (B % A == 0) {
                System.out.println("factor");
            } else if (A % B == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
    }

