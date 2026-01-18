package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _24511 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int[] q=new int[N];
        StringTokenizer st=new StringTokenizer(bf.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<N; i++){
            q[i]=Integer.parseInt(st.nextToken());
        }

        Deque<Integer> que=new ArrayDeque<>();
        st = new StringTokenizer(bf.readLine());

        for(int i=0; i<N; i++){

            int value=Integer.parseInt(st.nextToken());

            if(q[i]==0){
                que.addLast(value);
            }

        }

        int M=Integer.parseInt(bf.readLine());
        st=new StringTokenizer(bf.readLine());
        for(int i=0; i<M; i++){
            int va=Integer.parseInt(st.nextToken());
            que.addFirst(va);

            sb.append(que.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
