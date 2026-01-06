package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _18870 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int[] origin=new int[N];
        int[] sorted=new int[N];

        StringTokenizer st=new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++){
            origin[i]=sorted[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        HashMap<Integer,Integer> rankMap=new HashMap<>();
        int rank=0;
        /*
        이미 정렬된 배열에서 rank를 ++ 해줘서 rank를 구함
         */
        for(int value: sorted){
            if(!rankMap.containsKey(value)){
                rankMap.put(value,rank);
                rank++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int value:origin){
            sb.append(rankMap.get(value)).append(' ');
        }
        System.out.println(sb);


    }
}
