package Sector2_Array.문제11_임시반장_정하기_다시;

import java.util.Scanner;

public class Main_fail {
    public int solution (int n, int[][] arr){
        int answer = 0;
        /*
            1. 최대한 여러학생과 겹쳐야함 => 같은 학생과 여러번 겹쳐도 사실 한명 겹친거
            2. 반 배열을 만들고 학생들끼리 겹치는 것을 저장하는 2차원 배열을 만든다.

         */

        int max=0;
        int[] student = new int[n];


        for(int i=0; i<5; i++){
            int[] c= new int[9];
            for(int j=0; j<n; j++){
                c[arr[j][i]-1]++;
            }
            for(int k=0; k<9; k++){
                if(c[k]>1){
                    for(int l=0; l<n; l++){
                        if(arr[l][i]-1==k)student[l]++;
                    }
                }
            }

        }


        for(int i=0; i<n; i++){
            if(student[i]>max)max=student[i];


            System.out.println(i+1+":"+student[i]+" ");
        }


        for(int i=0; i<n; i++){
            if(student[i]==max){
                answer= i+1;
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main_fail T =new Main_fail();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }
}