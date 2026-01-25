package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1260 {
    static ArrayList<Integer>[] pg;
    static boolean[] arr;

    static int count=1;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int R=Integer.parseInt(st.nextToken());

        pg=new ArrayList[N+1];


        for(int i=1; i<=N; i++){
            pg[i]=new ArrayList<>();
        }

        for(int i=1; i<=M; i++){
            st=new StringTokenizer(bf.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());

            pg[u].add(v);
            pg[v].add(u);

        }
        for(int i = 1; i <= N; i++) {
            Collections.sort(pg[i]);
        }
        arr=new boolean[N+1];
        dfs(R);
        sb.append('\n');

        arr=new boolean[N+1];
        bfs(R);

        System.out.println(sb);
    }

    public static void dfs(int node){
        arr[node]=true;
        sb.append(node).append(' ');
        for(int next: pg[node]){
            if(!arr[next]){
                dfs(next);

            }
        }
    }

    public static void bfs(int node){
        Queue<Integer> q=new ArrayDeque<>();

        q.add(node);
        arr[node]=true;

        while(!q.isEmpty()){
            int no=q.poll();
            sb.append(no).append(' ');
            for(int next: pg[no]){
                if(!arr[next]) {
                    arr[next]=true;
                    q.add(next);
                }
            }
        }
    }
}
