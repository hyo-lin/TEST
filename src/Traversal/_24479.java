package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _24479 {
    static ArrayList<Integer>[] gr;
    static int[] visited;
    static int count=1;

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        gr=new ArrayList[N+1];
        visited = new int[N + 1];

        for(int i=1; i<=N; i++){
            gr[i]=new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st=new StringTokenizer(bf.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            gr[u].add(v);
            gr[v].add(u);

        }

        for(int i=1; i<=N; i++){
            Collections.sort(gr[i]);
        }

        dfs(R);

        StringBuilder sb=new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int node){
        visited[node]=count;
        count++;

        for(int next: gr[node]){
            if(visited[next]==0){
                dfs(next);
            }
        }
    }

}
