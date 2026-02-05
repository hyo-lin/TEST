package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697 {
    static ArrayList<Integer>[] gp;

    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());


        bfs(N,K);


    }

    public static void bfs(int st,int en){
        Queue<Integer> que=new LinkedList<>();
        int[] time = new int[100001];

        que.add(st);
        time[st]=1;

        while(!que.isEmpty()){
            int m=que.poll();

            if (m == en) {
                System.out.println(time[m] - 1);
                return;
            }

            int[] nextStep = {m - 1, m + 1, m * 2};

            for(int next: nextStep){
                if(next>=0 && next<=100000 && time[next]==0){
                    time[next]=time[m]+1;
                    que.add(next);
                }
            }
        }
    }
}
