package Factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n=Integer.parseInt(bf.readLine());
if(n==-1) break;
ArrayList<Integer> list=new ArrayList<>();
int sum=0;

for(int i=1; i<n; i++){
    if(n%i==0){
        list.add(i);
        sum+=i;
    }
}
if(sum==n){
    StringBuilder sb=new StringBuilder();
    sb.append(n).append(" = ");
    for(int i=0; i<list.size(); i++){
        sb.append(list.get(i));
        if(i<list.size()-1){
            sb.append(" + ");
        }

    }        System.out.println(sb.toString());

}else{
    System.out.println(n + " is NOT perfect.");
}

        }
    }
}
