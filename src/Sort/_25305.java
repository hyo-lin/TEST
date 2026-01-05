package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _25305 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int[] arr=new int[N];
        // ★ 두 번째 줄을 읽기 위해 st를 새로 갱신해야 합니다!
        st = new StringTokenizer(bf.readLine());

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);
        System.out.println(arr[N-M]);
    }
}
