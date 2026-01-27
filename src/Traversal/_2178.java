package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2178 {
    static int[][] pg;

    static int N;
    static int M;


    static int[] dx={0,0,-1,1};
    static int[] dy={1,-1,0,0};


    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        pg=new int[N][M];


        for(int i=0; i<N; i++){
            String s = bf.readLine();
            for(int j=0; j<M; j++){
                pg[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0,0);
        System.out.println(pg[N-1][M-1]);
    }

    public static void bfs(int x, int y){
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{x,y});

        while(!queue.isEmpty()){
            int[] now=queue.poll();
            int cx=now[0];
            int cy=now[1];

            for(int i=0; i<4; i++){
                int nx=cx+dx[i];
                int ny=cy+dy[i];
                if(nx>=0 && ny>=0 && nx<M && ny<N){
                    if(pg[nx][ny]==1){
                        pg[nx][ny]=pg[cx][cy]+1;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }

    }
}
