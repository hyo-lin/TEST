package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14888 {
    static int N;
    static int MAX=Integer.MAX_VALUE;
    static int MIN=Integer.MIN_VALUE;
    static int[] operators=new int[4];

    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(bf.readLine());
        int[] numbers = new int[N];

        StringTokenizer st=new StringTokenizer(bf.readLine());

        for(int i=0; i<N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st=new StringTokenizer(bf.readLine());

        for(int i=0; i<4; i++){
            operators[i]=Integer.parseInt(st.nextToken());
        }



    }

    static void dfs(int depth,int num){
        if(depth==N){
            MAX=Math.max(MAX,num);
            MIN=Math.min(MIN,num);
            return;
        }

        for(int i=0; i<4; i++){
            if(operators[i]>0){
                operators[i]--;
                switch(){

                }
            }
        }
    }
}
