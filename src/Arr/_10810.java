package Arr;

import java.util.Scanner;

public class _10810  {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        int M=sc.nextInt();
        int[] arr=new int[N];
        for(int p=0; p<M; p++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            for(int q=i-1; q<j; q++){
                arr[q]=k;
            }
        }

        for(int p=0; p<N;p++){
            System.out.print(arr[p]+" ");

        }



    }


}
