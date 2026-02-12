package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2206 {

  static Queue<int[]> que=new LinkedList<>();
  static int[] dx={0,0,-1,1};
  static int[] dy={1,-1,0,0};

  static int N;
  static int M;
  static int[][] board;
  static boolean[][][] visited;

  public static void main(String[] args)throws IOException{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(bf.readLine());
    N=Integer.parseInt(st.nextToken());
    M=Integer.parseInt(st.nextToken());

    board=new int[N][M];
    visited=new boolean[N][M][2];

    for(int i=0; i<N; i++){
      String s=bf.readLine();
      for(int j=0; j<M; j++){
        board[i][j]=s.charAt(j)-'0';
      }
    }

    System.out.println(bfs());
  }

  static int bfs(){
    que.offer(new int[]{0,0,0,1});
    visited[0][0][0] = true;
    while(!que.isEmpty()){
      int[] m=que.poll();
      int x=m[0];
      int y=m[1];
      int vi=m[2];
      int dist=m[3];

      if(x==N-1 && y==M-1){
        return dist;
      }

      for(int i=0; i<4; i++){
        int px=x+dx[i];
        int py=y+dy[i];

        if(px>=0 && py>=0 && px<N && py<M){
          if(board[px][py]==0 && !visited[px][py][vi]){
            visited[px][py][vi]=true;
            que.offer(new int[]{px,py,vi,dist+1});
          }
          // 아직 벽을 안 부쉈고 다음칸에 벽을 부수고 방문한적이 없음
          if(board[px][py]==1 &&  vi == 0 && !visited[px][py][1]){
            visited[px][py][1]=true;
            que.offer(new int[]{px,py,1,dist+1});
          }
        }
      }
    }
    return -1;
  }
}
