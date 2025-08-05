package Sector3_Two_pointer_Sliding_window_On2_to_On.문제3_최대_매출;

import java.util.Scanner;

public class Main_sliding_window {
    public int solution (int n,int k ,int[] arr){
        int answer= 0;
        int sum =0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        answer=sum;
        for(int i=k; i<n; i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>answer){
                answer=sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_sliding_window T =new Main_sliding_window();
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