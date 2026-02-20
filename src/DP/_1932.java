package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1932 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][];
        int[][] dp=new int[N][];
        for(int i = 0; i < N; i++){
            arr[i] = new int[i+1];   // 줄 길이 생성
            dp[i]=new int[i+1];

            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j <= i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];

        for(int i=1; i<N; i++){
            for(int j=0; j<=i; j++){

                if(j==0){
                    dp[i][0]=dp[i-1][0]+arr[i][j];
                }
                else if(j==i){
                    dp[i][i]=dp[i-1][i-1]+arr[i][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j-1], dp[i-1][j])+arr[i][j];
                }

            }


        }
        int max=0;
        for(int j=0; j<N; j++){
            max=Math.max(dp[N-1][j],max);
        }
        System.out.println(max);
    }
}
