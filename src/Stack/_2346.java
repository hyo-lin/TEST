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
        Deque<Integer> que=new ArrayDeque<>();
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int count=0;

        for(int i=0; i<N; i++){

            que.offer(Integer.parseInt(st.nextToken()));

            }
        if(que.poll()>0){
            sb.append("1").append(" ");


        }

    }
}
