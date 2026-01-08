package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10816 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());

        HashMap<Integer,Integer>map=new HashMap<>();
        StringTokenizer st=new StringTokenizer((bf.readLine()));

        for(int i=0; i<N; i++){
            int num=Integer.parseInt(st.nextToken());
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int M=Integer.parseInt(bf.readLine());

        StringBuilder sb=new StringBuilder();
        st=new StringTokenizer(bf.readLine());

        for(int j=0; j<M; j++){
            int query=Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(query,0)).append(" ");
        }
        System.out.println(sb);
    }
}
