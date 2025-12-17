package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2903 {
    public static void main(String[] args) throws IOException {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(bf.readLine());
        int res = 2;
        for (int i = 1; i <= n; i++) {
            res = (res-1) + res;
        }
        System.out.println(res*res);
    }
}
