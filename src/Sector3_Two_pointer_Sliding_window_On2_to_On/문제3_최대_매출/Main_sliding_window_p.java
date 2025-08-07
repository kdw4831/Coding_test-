package Sector3_Two_pointer_Sliding_window_On2_to_On.문제3_최대_매출;

import java.util.Scanner;

public class Main_sliding_window_p {
    public int solution (int n,int k ,int[] arr){
        int sum=0, max=0;
        for(int i=0; i<k; i++)sum+=arr[i];
        for(int i=k; i<n; i++){
            if(sum>max)max=sum;
            sum=sum-arr[i-k]+arr[i];
            System.out.println(sum);
        }

        return max;
    }

    public static void main(String[] args) {
        Main_sliding_window_p T =new Main_sliding_window_p();
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