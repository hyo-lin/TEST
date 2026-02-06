package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7562 {
    static int N;
    static int l;
    static boolean[][] visited;
    static int[][] arr;

    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(bf.readLine());
        for(int i=0; i<N; i++){
            l=Integer.parseInt(bf.readLine());

            arr = new int[l][l];
            visited=new boolean[l][l];

            StringTokenizer st = new StringTokenizer(bf.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(bf.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());

            bfs(startX, startY, targetX, targetY);
        }
    }

    public static void bfs(int x, int y, int targx, int tary){

        if (x == targx && y == tary) {
            System.out.println(0);
            return;
        }

        Queue<int[]> que=new LinkedList<>();
        que.add(new int[] {x,y});
        visited[x][y]=true;

       while(!que.isEmpty()){
           int[] curr=que.poll();
           int cx=curr[0];
           int cy=curr[1];

           if (cx == targx && cy == tary) {
               System.out.println(arr[cx][cy]);
               return; // 찾았으면 더 이상 탐색하지 않고 종료
           }

           for(int i=0; i<8; i++){
               int ox=cx+dx[i];
               int oy=cy+dy[i];

               if(ox>=0 && oy>=0 && ox<l && oy<l){
                   if(!visited[ox][oy]){
                       que.add(new int[]{ox,oy});
                       arr[ox][oy]=arr[cx][cy]+1;
                       visited[ox][oy]=true;
                   }
               }
           }
       }
    }
}
