package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _1269 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        HashSet<Integer> has=new HashSet<>();
        st = new StringTokenizer(bf.readLine());

        for(int i=0; i<N; i++){
            has.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(bf.readLine());

        int count=0;
        for(int i=0; i<M; i++){
            int p=Integer.parseInt(st.nextToken());
            if(has.contains(p)){
                count++;
            }
        }
        int result=M+N-2*count;
        System.out.println(result);}
}
