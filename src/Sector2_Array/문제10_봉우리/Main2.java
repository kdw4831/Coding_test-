package Sector2_Array.문제10_봉우리;

import java.util.Scanner;

public class Main2 {
    public int solution (int n, int[][] arr){
        int answer=0;
        int[] dx ={-1,0,0,1};
        int[] dy ={0,1,-1,0};
        boolean flag;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                flag=true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny= j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[i][j] <= arr[nx][ny]){
                        flag= false;
                        break;
                    }
                }
                if(flag)answer++;

            }
        }

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