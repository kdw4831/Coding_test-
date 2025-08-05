package Sector3_Two_pointer_Sliding_window_On2_to_On.문제3_최대_매출;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public int solution (int n,int k ,int[] arr){
        int answer= 0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n-k+1; i++){
            int sum=0;
            for(int j=0; j<k; j++){
                sum+=arr[i+j];
            }
            if(sum>max){
                max=sum;
                answer=sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
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