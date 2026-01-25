package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _2606 {
    static ArrayList<Integer>[] gp;
    static int[] arr;
    static int count=0;

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int M=Integer.parseInt(bf.readLine());

        gp=new ArrayList[N+1];
        arr=new int[N+1];

        for(int i=1; i<=N; i++){
            gp[i]=new ArrayList<>();
        }

        for(int i=1; i<=M; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());

            gp[u].add(v);
            gp[v].add(u);

        }



        dfs(1);
        System.out.println(count);


    }

    public static void dfs(int node){
        arr[node]=1;
        for(int next: gp[node]){
            if(arr[next]==0){
                count++;
                dfs(next);
            }
        }
    }
}
