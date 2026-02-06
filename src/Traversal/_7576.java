package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7576 {
    static Queue<int[]> que=new LinkedList<>();
    static int N;
    static int M;
    static int[][] p;
    static int[] dx={0,0,-1,1};
    static int[] dy={1,-1,0,0};

    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());

        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());

        p=new int[N][M];

        for(int i=0; i<N; i++){
            st=new StringTokenizer(bf.readLine());
            for(int j=0; j<M; j++){
            p[i][j]=Integer.parseInt(st.nextToken());
            if(p[i][j]==1){
                que.add(new int[]{i,j});
            }
            }
        }

        System.out.println(bfs());

    }

    static int bfs(){
        while(!que.isEmpty()){
            int[] curr = que.poll();
            int cx = curr[0];
            int cy = curr[1];

                for(int i=0; i<4; i++){
                    int ox=dx[i]+cx;
                    int oy=dy[i]+cy;
                    if(ox>=0 && oy>=0 && ox<N && oy<M ){
                        if(p[ox][oy]==0){
                            p[ox][oy]=p[cx][cy]+1;
                            que.add(new int[]{ox,oy});
                        }

                    }
                }
        }

        int maxDays=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(p[i][j]==0) return -1;
                maxDays=Math.max(maxDays, p[i][j]);
            }
        }
        return maxDays -1;
    }
}
