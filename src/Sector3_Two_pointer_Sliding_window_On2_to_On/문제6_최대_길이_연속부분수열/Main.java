package Sector3_Two_pointer_Sliding_window_On2_to_On.문제6_최대_길이_연속부분수열;

import java.util.Scanner;

public class Main {
    public int solution (int n, int k, int[] arr){
        int answer=0;
        int lt=1 , sum=1;
        // 1 2 3 4 5  이를 보면 k/2 +1 이 범위까지만 가능
        // 5/2+1이 3이다 까지만 더해야한다.
        // 만약 3,4 이렇게 가면 무조건 k값을 넘는다.
        for(int rt=2; rt<n/2+1; rt++){
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
        Main T =new Main();
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