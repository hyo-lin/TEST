package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _11866 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb=new StringBuilder();
        Deque<Integer> que=new ArrayDeque<>();

        for(int i=1; i<=N; i++){
            que.offer(i);
        }
        sb.append("<");

        while(que.size()>1){
            for(int i=0; i<K-1; i++){
                que.offer(que.poll());
            }
            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append(">");
        System.out.println(sb);

    }
}
