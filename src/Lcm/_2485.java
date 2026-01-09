package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2485 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int[] arr=new int[N];
        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int gcdValue = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            int distance = arr[i] - arr[i-1];
            gcdValue = gcd(gcdValue, distance);
        }
        System.out.println((arr[N-1] - arr[0]) / gcdValue + 1 - N);

    }
    public static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b, a%b);
    }
}
