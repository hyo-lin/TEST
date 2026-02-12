package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15650 {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        arr=new int[M];
        visit=new boolean[N];

        dfs(N,M, 0,1);

        System.out.println(sb);
    }
    static void dfs(int N,int M,int depth,int start){
        if(depth==M){
            for(int val:arr){

                sb.append(val).append(' ');
                return;
            }
            sb.append('\n');
            return;
        }
        for(int i=start; i<=N; i++){
                arr[depth]=i;
                dfs(N,M,depth+1,i+1);

        }
    }
}
