package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10870 {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());

        int a = 0, b = 1;        // F0=0, F1=1
        for (int i = 0; i < n; i++) {
            int next = a + b;    // 다음 피보나치
            a = b;               // 한 칸 전진
            b = next;
        }
        System.out.print(a);     // a = F(n)
    }

}
