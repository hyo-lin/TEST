package Arr;

import java.util.Scanner;

public class _10811  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] arr= new int[N];

        for(int q=0; q<N; q++){
            arr[q]=q+1; //1,2,3,4,5
        }

        for(int p=0; p<M; p++){

            int i=sc.nextInt()-1;
            int j=sc.nextInt()-1;

            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }


        }
        for(int n: arr){
            System.out.print(n+" ");
        }






    }


}
