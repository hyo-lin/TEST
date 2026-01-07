package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _14425 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        HashSet<String> has=new HashSet<>();
        for(int i=0; i<N; i++){
            has.add(bf.readLine());
        }
        int count=0;

        for(int j=0; j<M; j++){
            String str=bf.readLine();
            if(has.contains(str)){
                count++;
            }
        }
        System.out.println(count);


    }
}
