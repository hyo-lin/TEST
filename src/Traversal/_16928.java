package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16928 {

    static int[][] arr;

    public static void main(String[] args)throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
    }
}
