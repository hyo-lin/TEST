package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class _10814 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        String[][] arr=new String[N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            arr[i][0]=st.nextToken();

        }
        Arrays.sort(arr, (e1, e2)->{
                return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]);

        });
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }

}
