package Sector2_Array.문제2_보이는_학생;

import java.util.*;

public class Main {
    public int solution (int n, int[] arr){
        int answer = 0;
        int max_height = 0;

        for(int tmp : arr){
            if(tmp> max_height) {
                max_height=tmp;
                answer++;
            }
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