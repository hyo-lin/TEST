package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9012 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            sb.append(solve(bf.readLine())).append("\n");
        }
        System.out.println(sb);
    }
    public static String solve(String s){
        int count=0;

        for(char c: s.toCharArray()){
            if(c=='(') {
                count++;
            }
            else if(count==0){
                return "NO";
            }
            else{
                count--;
            }
        }

        if(count==0) return "YES";
        else return "NO";
    }
}
