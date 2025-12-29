package Factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11653 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        for(int i=2; i<=n; i++ ){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}
