package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _16928 {


    static int[] board=new int[101];
    static int[] count=new int[101];
    static boolean[] bol=new boolean[101];

    public static void main(String[] args)throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        for(int i=1; i<=100; i++){
            board[i]=i;
        }

        for(int i=0; i<N; i++){
            st=new StringTokenizer(bf.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            board[start]=end;
        }
        for(int i=0; i<M; i++){
            st=new StringTokenizer(bf.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            board[start]=end;
        }

        bfs();
    }

    static void bfs(){
        Queue<Integer> que=new LinkedList<>();
        que.offer(1);
        bol[1]=true;
        count[1]=0;

        while(!que.isEmpty()){
            int curr=que.poll();

            if(curr==100){
                System.out.println(count[100]);
                return;
            }
            for(int i=1; i<=6; i++){
                int next=curr+i;
                if(next>100) continue;

                int target=board[next];
                if(!bol[target]){
                    bol[target]=true;
                    count[target]=count[curr]+1;
                    que.offer(target);
                }
            }
        }

    }
}
