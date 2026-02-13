package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15652 {
    static StringBuilder sb=new StringBuilder();
    static int N,M;
    static int[] arr;


    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        arr=new int[M];
        dfs(0,1);
        System.out.println(sb);
    }

    static void dfs(int depth,int str){
        if(depth==M){
            for(int val:arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=str; i<=N; i++){
            arr[depth]=i;
            dfs(depth+1,i);
        }
    }
}
