package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13241 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        StringBuilder sb=new StringBuilder();

        long A=Integer.parseInt(st.nextToken());
        long B=Integer.parseInt(st.nextToken());

        long d=gcd(A,B);

        sb.append(A*B/d);
        System.out.print(sb);


    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
