package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        Stack<Integer> stack=new Stack<>();
        int result=0;

        for(int i=0; i<N; i++){
            int x=Integer.parseInt(bf.readLine());

            if(x==0) stack.pop();
            else stack.push(x);
        }
        for(int s:stack){
            result+=s;
        }
        System.out.println(result);
    }
}
