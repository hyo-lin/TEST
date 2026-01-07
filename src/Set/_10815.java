package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _10815 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());

        HashSet<Integer> has=new HashSet<>();
        StringTokenizer st=new StringTokenizer(bf.readLine());

        for(int i=0; i<N; i++){
            has.add(Integer.parseInt(st.nextToken()));
        }


        int M=Integer.parseInt(bf.readLine());

        st=new StringTokenizer(bf.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<M; i++){
            int target=Integer.parseInt(st.nextToken());

            if(has.contains(target)){
                sb.append("1 ");
            }
                else sb.append("0 ");

        }
        System.out.println(sb);
    }
}
