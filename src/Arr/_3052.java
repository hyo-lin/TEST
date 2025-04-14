package Arr;

import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //입력 받기 위한 스캐너 클래스

        int[] arr = new int[10];
        boolean bl; // 배열의 n번째 나머지와 n+1번째 나머지 동일 여부 판단 변수
        int count = 0; // 서로 다른 나머지들의 개수 변수

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt()%42;
        }

        for(int i=0; i<arr.length; i++) {
            bl = false; // 기본값 초기화
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if(bl==false) {
                count++;
            }
        }

        System.out.println(count);
    }
}
