package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class _18258 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(bf.readLine());
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            st=new StringTokenizer(bf.readLine());
            String command=st.nextToken();

            switch(command){
                case "push":
                    int x=Integer.parseInt(st.nextToken());
                    q.offer(x);
                    break;
                case "pop":
                    if(q.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(q.poll()).append("\n");
                    break;
                case "size":
                    if(q.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if(q.isEmpty()) sb.append("1").append("\n");
                    else sb.append(q.peek()).append("\n");
                    break;
                case "back":
                    if(q.isEmpty()) sb.append("1").append("\n");
                    else sb.append(q.peekLast()).append("\n");
                    break;
            }


        }
        System.out.println(sb);
    }
}
