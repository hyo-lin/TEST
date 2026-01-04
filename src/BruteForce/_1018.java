package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        char[][] board=new char[N][M];
        for(int i=0; i<N; i++){
          board[i]=bf.readLine().toCharArray();
        }

        int minResult=64;

        for(int i=0; i<=N-8; i++){
            for(int j=0; j<=M-8; j++){
                int countW=0;
                int countB=0;

                for(int r=0; r<8; r++){
                    for(int c=0; c<8; c++){
                        char currentColor=board[i+r][j+c];

                        if((r+c)%2==0){
                            if(currentColor!='W') countW++;
                            if(currentColor!='B') countB++;
                        } else{
                            if(currentColor!='W') countB++;
                            if(currentColor!='B') countW++;
                        }
                    }
                }
                int currentMin=Math.min(countW, countB);
                minResult=Math.min(minResult, currentMin);
            }
        }
        System.out.println(minResult);
    }
}
