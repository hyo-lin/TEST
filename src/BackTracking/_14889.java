package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14889 {
    static int N;
    static int[][] arr;
    static int MIN=Integer.MAX_VALUE;
    static boolean[] visit;
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(bf.readLine());
        arr=new int[N][N];
        visit = new boolean[N];

        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            for(int j=0; j<N; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(MIN);
    }

    static void dfs(int idx, int count){
        if(count==N/2){
            diff();
            return;
        }
        for(int i=idx; i<N; i++){
            if(!visit[i]){
                visit[i]=true;
                dfs(i+1,count+1);
                visit[i]=false;
            }
        }
    }
    static void diff(){
        int st=0;
        int link=0;

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(visit[i] && visit[j]){
                    st+=arr[i][j];
                    st+=arr[j][i];
                }
                else if(!visit[i] && !visit[j]){
                    link+=arr[i][j];
                    link+=arr[j][i];
                }
            }
        }
        int val=Math.abs(st-link);

        MIN = Math.min(val, MIN);
    }
}
