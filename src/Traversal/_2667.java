package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _2667 {
    static int[][] pg;
    static boolean[][] bool;
    static int N;
    static int count=0;

    static int[] dx={0,0,-1,1};
    static int[] dy={1,-1,0,0};


    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(bf.readLine());

        pg=new int[N][N];
        bool = new boolean[N][N];

        for(int i=0; i<N; i++){
            String s=bf.readLine();
            for(int j=0; j<N; j++){
                pg[i][j]=s.charAt(j)-'0';
            }
        }

        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(pg[i][j]==1 && !bool[i][j]){
                    count=0;
                    dfs(i,j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int a: result){
            System.out.println(a);
        }
    }

    public static void dfs(int x, int y){
        bool[x][y]=true;
        count++;

        for(int i=0; i<4; i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(pg[nx][ny]==1 && !bool[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }


}
