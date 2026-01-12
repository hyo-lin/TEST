package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2164 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0; i<N; i++){
            q.offer(i+1);
        }
        while(q.size()>1){
                q.poll();
                q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}
