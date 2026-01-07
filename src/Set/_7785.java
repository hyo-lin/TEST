package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _7785 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        HashSet<String> has =new HashSet<>();

        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(bf.readLine());
            String name=st.nextToken();
            String status=st.nextToken();

            if(status.equals("enter")){
                has.add(name);
            }else{
                has.remove(name);
            }
        }
        ArrayList<String> list=new ArrayList<>(has);
        // 리스트 sort는 Collections.sort
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb=new StringBuilder();
        for(String s:list){
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
