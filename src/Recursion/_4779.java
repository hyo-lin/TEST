package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4779 {
    static StringBuilder sb;
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine())!=null && !str.isEmpty()){
            int N = Integer.parseInt(str);
            sb=new StringBuilder();
            solve(N);
            System.out.println(sb);
        }

    }

    public static void solve(int N){
        if(N==0){
            sb.append("-");
            return;
        }
        solve(N-1);

        for(int i=0; i<Math.pow(3,N-1); i++){
            sb.append(" ");
        }
        solve(N-1);

    }
}
