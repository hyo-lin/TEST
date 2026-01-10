package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _28278 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){
            st=new StringTokenizer(bf.readLine());
            String command=st.nextToken();

            if(command.equals("1")){
                int x=Integer.parseInt(st.nextToken());
                stack.push(x);
            }
            else if(command.equals("2")){
                if(stack.isEmpty()) sb.append("-1").append("\n");
                else sb.append(stack.pop()).append("\n");
            }
            else if(command.equals("3")){
                sb.append(stack.size()).append("\n");;
            }
            else if(command.equals("4")){
                if(stack.isEmpty()) sb.append("1").append("\n");
                else sb.append("0").append("\n");
            }
            else if(command.equals("5")){
                if(stack.isEmpty()) sb.append("-1").append("\n");
                else sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
