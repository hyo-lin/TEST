package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24416 {
    static int counto, countw;
    static int[] f;

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        f = new int[n+1];

        counto=0;
        countw=0;

        fib(n);
        fibonacci(n);

        System.out.println(counto+" "+countw);
    }

    static int fib(int n) {

        if (n == 1 || n == 2){
        counto++;
        return 1;
        }
    else return (fib(n - 1) + fib(n - 2));
    }

    static int fibonacci(int n) {
        f[1]=1;
        f[2]=1;

        for(int i=3; i<=n; i++){
            countw++;
            f[i]= f[i - 1] + f[i - 2];

        }
        return f[n];
    }
}
