package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1620 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

       HashMap<String, Integer> has=new HashMap<>();
       String[] arr=new String[N+1];

       for(int i=1; i<=N; i++){
           String name=bf.readLine();
           has.put(name,i);
           arr[i]=name;
       }

       StringBuilder sb=new StringBuilder();

       for(int i=0; i<M; i++){
           String query=bf.readLine();

           if(Character.isDigit(query.charAt(0))){ //숫자->문자
               int index=Integer.parseInt(query);
               sb.append(arr[index]).append('\n');
           }
           else{
               //문자->숫자
               sb.append(has.get(query)).append('\n');

           }
       }
        System.out.println(sb);
    }
}
