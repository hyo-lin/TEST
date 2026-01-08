package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1934 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(bf.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<T; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());

            int d=gcd(A,B);

            sb.append(A*B/d).append('\n');
        }
            System.out.println(sb);
    }
            public static int gcd(int a, int b){
                if(b==0) return a;
                return gcd(b,a%b);
            }
        }

