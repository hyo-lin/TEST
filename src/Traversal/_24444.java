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
            gp[i]=new ArrayList<>();
        }

        for(int i=0; i<M; i++){
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
    }

    static void bfs(int node){
        Queue<Integer> que=new LinkedList<>();
        arr[node] = count++;
        que.add(node);

        while(!que.isEmpty()){
            int curr=que.poll();

            for(int next: gp[curr]){
                if(arr[next]==0){
                    arr[next]=count++;
                    que.add(next);
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=1; i<=arr.length; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

    }
}
