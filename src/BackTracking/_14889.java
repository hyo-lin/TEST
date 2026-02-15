package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14889 {
    static int[][] arr;
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        arr=new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int num=arr[i][j]+arr[j][i];
            }
        }
    }
}
