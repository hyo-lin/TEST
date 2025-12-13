package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11005 {
    //todo: 다른 방식으로 알아보기
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());

        StringBuilder sb=new StringBuilder();
        if(N==0){
            sb.append('0');
        } else{
            while(N>0){
                int rest=N%B;
                char c;
                if(rest<10){
                    c=(char)('0'+rest);
                }else{
                    c=(char)('A'+rest-10);
                }
                sb.append(c);
                N/=B;
            }
        }
        System.out.println(sb.reverse().toString());



        bf.close();

    }
}
