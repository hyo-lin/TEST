package For;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _25304 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int X= i.nextInt();

        int N= i.nextInt();
        int tot=0;
        for(int t=0; t<N; t++){
            int a= i.nextInt();
            int b= i.nextInt();

            tot+=a*b;
        }

        if(tot==X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }




}
