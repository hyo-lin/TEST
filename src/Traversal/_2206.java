package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2206 {

    static Queue<int[]> que=new LinkedList<>();

    static int N;
    static int M;
    static int[] dx={0,0,-1,1};
    static int[] dy={1,-1,0,0};
    static int[][] board;
    static boolean[][] bol;

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        board=new int[N][M];

        for(int i=0; i<N; i++){
            String s=bf.readLine();
            for(int j=0; j<M; j++){
                board[i][j] = Integer.valueOf(s.charAt(j) - '0');
            }
        }

        bfs();
    }

    static int bfs(){
        que.offer(new int[]{0,0,0});
        while(!que.isEmpty()){
            int[] m=que.poll();
            int st=m[0];
            int mid=m[1];
            int en=m[2];

            for(int i=0; i<4; i++){
                int px=st+dx[i];
                int py=en+dy[i];

                if(px>=0 && py>=0 && px<=N && py<=M){
                    if(arr[px][py]==0){
                        arr[px][py]=arr[st][en]+1;
                        que.add(new int[]{px,py});
                    }
                }
            }
        }
        int max=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==1) return -1;
                max=Math.max(max, arr[i][j]);
            }
        }
        return max-1;
    }
}
