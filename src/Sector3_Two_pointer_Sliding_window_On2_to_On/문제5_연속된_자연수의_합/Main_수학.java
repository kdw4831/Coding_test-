package Sector3_Two_pointer_Sliding_window_On2_to_On.문제5_연속된_자연수의_합;

import java.util.Scanner;

public class Main_수학 {

    // 등차수열의 합 공식을 사용한다.
    // 5를 기준으로 2개의 연속된 수를 구해본다면?
    // 1, 2  => 5-1-2= 2 이다 이때 2%2 == 0이라면 조건을 카운트
    // 가능 하다. 2/2 면 1이다 이 때 1과 2 에 각각 몫을 더한 후 합산해주면 5로 구해진다
    // 이는 등차 수열의 합 공식을 이용한 것이다.

    public int solution (int n){
        int answer=0;
        int cnt=1; // 연속된 자연수의 개수
        n--;
        while(n>0){
            cnt++;
            n-=cnt;
            if(n%cnt==0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_수학 T =new Main_수학();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();


        System.out.println(T.solution(n));

    }
}