package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int count=0;
        while(true){
            if (N % 5 == 0) {
                count += (N / 5);
                System.out.println(count);
                break;
            } N -= 3; //일단 3kg 하나만 담아볼게. 그러면 남은 설탕은 혹시 5kg 봉지들로 딱 맞게 떨어질까?
            count++;
            if (N < 0) {
            System.out.println(-1); // 실패! -1 출력
            break;
        }
    }}
}
