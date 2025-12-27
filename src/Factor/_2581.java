package Factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int p=Integer.parseInt(bf.readLine());
        for(int i=n; i<=p; i++){
            if(i%2==0) return false;
            else{
                if(i*i)
            }
        }

    }
    // 소수인지 판별하는 "전용 도구"를 만듭니다.
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 1은 소수가 아님
        if (num == 2) return true; // 2는 소수임

        // 2의 배수를 여기서 미리 컷트할 수 있습니다.
        if (num % 2 == 0) return false;

        // 3부터 제곱근까지 '홀수'만 확인하면 훨씬 빠릅니다.
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
