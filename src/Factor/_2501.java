package Factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2501 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());
     for(int i=1; i<=n; i++){
         if(n%i==0){
p--;
         } if(p==0){
             System.out.println(i);
             return;
         }
     }         System.out.println(0);

    }
}
