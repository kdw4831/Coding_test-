package Sector2_Array.문제9_격자판_최대합;

import java.util.Scanner;

public class Main2 {
    public int solution (int n, int[][] arr){
        int answer = 0;
        int sum1, sum2;
        //행과 열의 합들
        for(int i=0; i<n; i++){
            sum1=0; sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer= Math.max(answer,sum1);
            answer= Math.max(answer,sum2);
        }



        //두 대각선들의 합
        sum1=sum2=0;
        for(int i=0; i<n; i++){
                sum1+=arr[i][i];
                sum2+=arr[i][n-i-1];
        }
        answer= Math.max(answer, sum1);
        answer= Math.max(answer, sum2);


        return answer;
    }
    public static void main(String[] args) {
        Main2 T =new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }

        }

        System.out.println(T.solution(n,arr));
    }
}