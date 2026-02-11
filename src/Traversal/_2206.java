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
    static boolean[][][] visited;


    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        board=new int[N][M];
        visited = new boolean[N][M][2];

        for(int i=0; i<N; i++){
            String s=bf.readLine();
            for(int j=0; j<M; j++){
                board[i][j] = Integer.valueOf(s.charAt(j) - '0');
            }
        }

        System.out.println(bfs());
    }

    static int bfs(){

        que.offer(new int[]{0,0,0,1});
        visited[0][0][0] = true;
        while(!que.isEmpty()){
            int[] cur=que.poll();
            int x = cur[0];
            int y = cur[1];
            int broken = cur[2];
            int dist = cur[3];

            if(x == N-1 && y == M-1){
                return dist;
            }

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && ny>=0 && nx<N && ny<M){
                    if(board[nx][ny] == 0 && !visited[nx][ny][broken]){
                        visited[nx][ny][broken] = true;
                        que.offer(new int[]{nx, ny, broken, dist+1});
                    }

                    if(board[nx][ny] == 1 && broken == 0 && !visited[nx][ny][1]){
                        visited[nx][ny][1] = true;
                        que.offer(new int[]{nx,ny,1,dist+1});
                    }
                }

            }
        }
        return -1;
    }
}
