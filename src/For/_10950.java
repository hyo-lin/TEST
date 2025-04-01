package For;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _10950 {
    public static void main(String args[]) {

        Scanner P=new Scanner(System.in);
        int T=P.nextInt();
        int arr[]=new int[T];
        for(int i=0; i<T; i++){
            int A=P.nextInt();
            int B=P.nextInt();
            arr[i]=A+B;

        }

        for(int k:arr){
            System.out.println(k);
        }




    }
}