package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9663 {
    static int[] arr;
    static int N;
    static int count;


    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(bf.readLine());

        arr=new int[N];
        count=0;

        dfs(0);

        System.out.println(count);

    }
    static void dfs(int depth){
        if(depth==N){
            count++;
            return;
        }

        for(int i=0; i<N; i++){
            arr[depth]=i;
            if(poss(depth)){
                dfs(depth+1);
            }
        }
    }

    static boolean poss(int col){
        for(int i=0; i<col; i++){
            if(arr[col]==arr[i]){
                return false;
            }

            else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])){
                return false;
            }
        }
        return true;
    }
}
