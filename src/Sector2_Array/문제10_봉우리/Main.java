package Sector2_Array.문제10_봉우리;

import java.util.Scanner;

public class Main {
    public int solution (int n, int[][] arr){
        int answer = 0;
        int max=0;
        int[][] arr2 = new int[n+2][n+2];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr2[i+1][j+1]=arr[i][j];

            }
        }


        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                max = Math.max(max,arr2[i-1][j]);
                max = Math.max(max,arr2[i][j-1]);
                max = Math.max(max,arr2[i][j+1]);
                max = Math.max(max,arr2[i+1][j]);
                if(arr2[i][j] > max)answer++;
                max=0;
            }
        }

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