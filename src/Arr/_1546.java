package Arr;

import java.util.Scanner;

public class _1546  {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int max=arr[0];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max ){
                max=arr[i];
            }
        }
        double sum=0;
        for(int j=0; j<N; j++){
            sum+=(double)arr[j]/max*100;

        }
        System.out.println(sum/N);


    }


}
