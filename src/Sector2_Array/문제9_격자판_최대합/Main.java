package Sector2_Array.문제9_격자판_최대합;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int solution (int n, int[][] arr){
        int answer = 0;
        int sum =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum+=arr[i][j];
            }
            if(answer<sum)answer=sum;
            sum=0;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum+=arr[j][i];
            }
            if(answer<sum)answer=sum;
            sum=0;
        }

        for(int i=0; i<n; i++){
                sum+=arr[i][i];
        }
        if(answer<sum)answer=sum;
        sum=0;

        for(int i=n-1; i>=0; i--){
            sum+=arr[i][i];

        }
        if(answer<sum)answer=sum;




        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
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