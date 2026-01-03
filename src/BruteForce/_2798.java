package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] arr=new int[N];
        int sum = 0;
        int max = 0;

        st = new StringTokenizer(bf.readLine()); // 매번 st 해줘야 함
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N-2; i++){ // 뒤에 넣을 거 생각해서
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum<=M) {
                        if (sum > max){
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
