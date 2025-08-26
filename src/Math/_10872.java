package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int answer=fact(n);
        System.out.println(answer);
    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n* fact(n-1);
        }
    }
}
