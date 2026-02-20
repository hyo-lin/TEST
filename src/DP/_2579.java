package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2579 {
    static int[] arr,dp;
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        arr=new int[N+1];
        dp=new int[N+1];

        for(int i=1; i<=N; i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }

        if (N == 1) {
            System.out.println(arr[1]);
            return;
        }

        dp[1]=arr[1];
        dp[2] = arr[1] + arr[2];

        for(int i=3; i<=N; i++){
            dp[i]=Math.max(dp[i-2], arr[i-1]+dp[i-3])+arr[i];
        }


        System.out.println(dp[N]);
    }
}
