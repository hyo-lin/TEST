package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14888 {
    static int N;
    static int MAX = Integer.MIN_VALUE; // 제일 작은 값으로 시작해야 커질 수 있음
    static int MIN = Integer.MAX_VALUE; // 제일 큰 값으로 시작해야 작아질 수 있음
    static int[] operators=new int[4];
    static int[] numbers;
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(bf.readLine());
        numbers = new int[N];
        StringTokenizer st=new StringTokenizer(bf.readLine());

        for(int i=0; i<N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st=new StringTokenizer(bf.readLine());

        for(int i=0; i<4; i++){
            operators[i]=Integer.parseInt(st.nextToken());
        }
        dfs(numbers[0],1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    static void dfs(int num,int depth){
        if(depth==N){
            MAX=Math.max(MAX,num);
            MIN=Math.min(MIN,num);
            return;
        }

        for(int i=0; i<4; i++){
            if(operators[i]>0){
                operators[i]--;
                switch(i){
                    case 0: dfs(num + numbers[depth], depth + 1); break;
                    case 1: dfs(num - numbers[depth], depth + 1); break;
                    case 2: dfs(num * numbers[depth], depth + 1); break;
                    case 3: dfs(num / numbers[depth], depth + 1); break;
                }
                operators[i]++;
            }


        }
    }
}
