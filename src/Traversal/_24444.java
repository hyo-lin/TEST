package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _24444 {
    static ArrayList<Integer>[] gp;
    static int[] arr;
    static int count=1;

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int R=Integer.parseInt(st.nextToken());

        gp=new ArrayList[N+1];
        arr=new int[N+1];

        for(int i=1; i<=N; i++){
            gp[i]=new ArrayList<Integer>();
        }

        for(int i=1; i<=M; i++){
            st=new StringTokenizer(bf.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());

            gp[u].add(v);
            gp[v].add(u);

        }

        for(int i=1; i<=N; i++){
            Collections.sort(gp[i]);
        }

        bfs(R);

        StringBuilder sb=new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void bfs(int str){
       Queue<Integer> q=new LinkedList<>();

       q.add(str);
       arr[str]=count;
       count++;

       while(!q.isEmpty()){
           int node=q.poll();

           for(int next: gp[node]){
               if(arr[next]==0){
                   q.add(next);
                   arr[next]=count;
                   count++;
               }
           }
       }

    }
}
