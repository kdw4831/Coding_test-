package Sector3_Two_pointer_Sliding_window_On2_to_On.문제5_연속된_자연수의_합;

import java.util.Scanner;

public class Main_p {
    public int solution (int n){
        int answer=0;
        int lt=1, sum=0;
        for(int rt=1; rt<=n/2+1; rt++){
            sum+=rt;
            if(sum==n)answer++;
            while(sum>=n){
                sum-=lt++;
                if(sum==n)answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_p T =new Main_p();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();


        System.out.println(T.solution(n));

    }
}