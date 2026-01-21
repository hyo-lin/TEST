package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2447 {
    static char[][] arr;

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());

        arr=new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }

        solve(0,0,N);
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    public static void solve(int x, int y, int N){
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }


        int size=N/3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1&& j==1){
                    continue;

                }
                solve(x+(i*size), y+(j*size), size);
            }

        }

    }
}
