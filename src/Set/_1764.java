package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1764 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<N; i++){
            set.add(bf.readLine());
        }

        ArrayList<String> arr=new ArrayList<>();
        for(int i=0; i<M; i++){
            String name=bf.readLine();

            if(set.contains(name)){
                arr.add(name);
            }
        }
        Collections.sort(arr);
        StringBuilder sb=new StringBuilder();
        sb.append(arr.size()).append('\n');

        for(String s: arr){
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
