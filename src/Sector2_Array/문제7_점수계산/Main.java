package Sector2_Array.문제7_점수계산;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int solution (int n, int[] arr){
        int score=0;
        int answer=0; //sum_score
        for(int tmp: arr){
            if(tmp==1) score++;
            else score=0;
            answer += score;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,arr));
    }
}