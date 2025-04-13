package Arr;

import java.util.Scanner;

public class _5597  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[30];
        for(int i=0; i<28; i++){
            int p=sc.nextInt();
            arr[p-1]=1; // 채워진걸 1로 표기

        }
        for(int i=0; i<30; i++){
            if(arr[i]!=1){
                System.out.println(i+1);
            }
        }



    }


}
