package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2587 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[5];
        int sum=0;

        for(int i=0; i<5; i++){
            arr[i]=Integer.parseInt(bf.readLine());

            sum+=arr[i];
        }
        Arrays.sort(arr);
        int avg=sum/5;
        int mid=arr[2];

        System.out.println(avg);
        System.out.println(mid);

    }
}
