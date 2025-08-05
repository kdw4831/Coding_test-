package Sector2_Array.문제12_멘토링_다시;

import java.util.Scanner;

public class Main {
    public int solution (int n,int m ,int[][] arr){
        int answer = 0;
        // 2중 for문을 통해서 튜플을 생각한다. 이차원 배열 안에
        // 있는 값을 지정한다고 생각을 해서 튜플의 개수를 예측하는 거지
        // 이러한 경우에는 4중 for문까지도 생각을 해야된다.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int p_i=0, p_j=0;
                int cnt=0;
                // 테스트 횟수를 반복하고
                for(int k=0; k<m; k++){
                    //학생의 등수를 지정한다.
                    for(int l=0; l<n; l++){
                        if(arr[k][l]-1 == i){
                            p_i=l;
                        }
                        if(arr[k][l]-1 == j){
                            p_j=l;
                        }
                    }
                    if(p_i<p_j)cnt++;
                }
                if(cnt==m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,m,arr));
    }
}