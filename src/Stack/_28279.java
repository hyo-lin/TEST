package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _28279 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        Deque<Integer> que=new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            int A=Integer.parseInt(st.nextToken());
            switch(A){
                case 1:
                    int x=Integer.parseInt(st.nextToken());
                    que.offerFirst(x);
                    break;
                case 2:
                    int t=Integer.parseInt(st.nextToken());
                    que.offerLast(t);
                    break;
                case 3:
                    if (que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.pollFirst()).append("\n");
                    break;
                case 4:
                    if (que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(que.size()).append("\n");
                    break;
                case 6:
                    if (que.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case 7:
                    if (que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.peekFirst()).append("\n");
                    break;
                case 8:
                    if (que.isEmpty()) sb.append("-1\n");
                    else sb.append(que.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
