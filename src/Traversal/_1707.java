package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1707 {
    static int V;
    static int E;

    static ArrayList<Integer>[] arr;
    static int[] color;


    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(bf.readLine());

        while(k-->0){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            V=Integer.parseInt(st.nextToken());
            E=Integer.parseInt(st.nextToken());

            arr = new ArrayList[V+1];
            color = new int[V+1];

            for(int i=1; i<=V; i++){
                arr[i]=new ArrayList<>();
            }
            for(int i=1; i<=E; i++){
                st=new StringTokenizer(bf.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                arr[u].add(v);
                arr[v].add(u);
            }

            boolean isBipartite = true;

            for(int i = 1; i <= V; i++){
                if(color[i] == 0){
                    if(!bfs(i)){
                        isBipartite = false;
                        break;
                    }
                }
            }

            if(isBipartite) System.out.println("YES");
            else System.out.println("NO");

        }



    }
    static boolean bfs(int start){
        Queue<Integer> que = new LinkedList<>();

        que.offer(start);
        color[start] = 1;

        while(!que.isEmpty()){
            int now = que.poll();

            for(int next : arr[now]){
                if(color[next] == 0){
                    color[next] = 3 - color[now];
                    que.offer(next);
                }
                else if(color[next] == color[now]){
                    return false;
                }
            }
        }
        return true;
    }

}
