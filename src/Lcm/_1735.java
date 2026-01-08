package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1735 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 두 번째 분수 입력 (C / D) - 입력을 새로 받아야 함!
        st = new StringTokenizer(bf.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int numer = A * D + C * B; // 분자
        int denom = B * D;         // 분모

        int g = gcd(numer, denom);

        System.out.println((numer / g) + " " + (denom / g));


    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
