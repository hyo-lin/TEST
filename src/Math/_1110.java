package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int A=Integer.parseInt(br.readLine());
        int count=0;
        int tmp=A;
        do{
            int sum=(tmp/10)+(tmp%10);
            tmp=(tmp%10)*10+(sum%10);

            count++;

        }while(tmp!=A);
        System.out.println(count);





    }


}
