package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _12789 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        Stack<Integer> stack=new Stack<>();
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int target=1;

        while(st.hasMoreTokens()){
            int current=Integer.parseInt(st.nextToken());

            if(current==target){
                target++;
            }
            else{
                stack.push(current);
            }
            while(!stack.isEmpty() && stack.peek()==target){
                stack.pop();
                target++;
            }


        }
        if(stack.isEmpty()){
            System.out.println("Nice");

        } else{
            System.out.println("Sad");
        }

    }
}
