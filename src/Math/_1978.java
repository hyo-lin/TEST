package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int A=Integer.parseInt(br.readLine());
        int[] B=new int[A];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++){
            B[i]=Integer.parseInt(st.nextToken());
        }
        int count=0;
        for(int i=0; i<A; i++){
            if(pr(B[i])){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean pr(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
