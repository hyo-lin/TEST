package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());

        int gcd=getGCD(n,p);

        System.out.println(gcd);
        System.out.println(((n*p)/gcd));

    }

    private static int getGCD(int n, int p){
        if(n%p==0) return p;
        return getGCD(p,n%p);
    }
}
