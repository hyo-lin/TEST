package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        while(true){
            String s=bf.readLine();
            if(s.equals(".")) break;
            sb.append(solve(s)).append('\n');
        }
        System.out.println(sb);
    }

    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            // 1. 여는 괄호는 무조건 넣는다
            if(c == '(' || c == '[') {
                stack.push(c);
            }

            // 2. 닫는 소괄호 ) 가 나왔을 때
            else if(c == ')') {
                // 스택이 비었거나, 짝꿍이 ( 가 아니면 실패
                if(stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }
                stack.pop(); // 짝이 맞으면 꺼냄
            }

            // 3. 닫는 대괄호 ] 가 나왔을 때
            else if(c == ']') {
                // 스택이 비었거나, 짝꿍이 [ 가 아니면 실패
                if(stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }
                stack.pop(); // 짝이 맞으면 꺼냄
            }
        }

        if(stack.isEmpty()) return "yes";
        else return "no";
    }
}
