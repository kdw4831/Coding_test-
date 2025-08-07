package Sector3_Two_pointer_Sliding_window_On2_to_On.문제4_연속_부분수열;

import java.util.Scanner;

public class Main_복합_p {
    public int solution (int n,int m ,int[] arr){
        int answer= 0;
        int sum=0, lt=0;

        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m){
                answer++;
            }
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m)answer++;
            }


        }


        return answer;
    }

    public static void main(String[] args) {
        Main_복합_p T =new Main_복합_p();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }



        System.out.println(T.solution(n,k,arr));

    }
}