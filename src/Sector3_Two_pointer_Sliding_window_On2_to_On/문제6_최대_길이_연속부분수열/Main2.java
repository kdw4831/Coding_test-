package Sector3_Two_pointer_Sliding_window_On2_to_On.문제6_최대_길이_연속부분수열;

import java.util.Scanner;

public class Main2 {
    public int solution (int n, int k, int[] arr){
        int answer=0;
        int lt=0, cnt=0;

        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0)cnt++;
            while(cnt>k){
                if(arr[lt]==0)cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }





        return answer;
    }

    public static void main(String[] args) {
        Main2 T =new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }


        System.out.println(T.solution(n,k,arr));

    }
}