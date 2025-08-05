package Sector3_Two_pointer_Sliding_window_On2_to_On.문제4_연속_부분수열;

import java.util.Scanner;

public class Main {
    public int solution (int n,int m ,int[] arr){
        int answer= 0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                if(sum==m){
                    answer++;
                    break;
                }else if(sum>m)break;
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