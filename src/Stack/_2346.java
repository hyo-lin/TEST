package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _2346 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        StringBuilder sb=new StringBuilder();
        Deque<int[]> que=new ArrayDeque<>();
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int[] arr=new int[N];
        int idx=0;

        while(st.hasMoreTokens()){
            int num=Integer.parseInt(st.nextToken());
            arr[idx++]=num;
        }

        for(int i=1; i<N; i++){

            que.offer(new int[]{arr[i],i+1});

            }
        sb.append(1).append(" ");

        int move=arr[0];

        for(int i=1; i<N; i++){
            if(move>0){
                for(int j=1; j<move; j++){
                    que.offer(que.poll());
                }
                int[] move_arr=que.poll();
                move=move_arr[0];
                sb.append(move_arr[1]).append(" ");

            }
            else{
                for(int j=1; j<-move;j++){
                    que.offerFirst(que.pollLast());
                }
                int[] move_arr=que.pollLast();
                move=move_arr[0];
                sb.append(move_arr[1]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
