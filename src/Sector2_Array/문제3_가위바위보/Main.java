package Sector2_Array.문제3_가위바위보;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution (int n, int[] A, int[] B){
        String answer= "";
        // 1=> 가위 2=> 바위 3=> 보
        //  비길 경우에는 D

        for(int i=0; i<n; i++){
            if(A[i] == B[i])answer+="D";
            else if(A[i] == 1 && B[i]==3 ||
                    A[i] == 2 && B[i]==1 ||
                    A[i] == 3 && B[i]==2  )answer+="A";
            else answer+="B";
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr2[i] = kb.nextInt();
        }

        String result=T.solution(n,arr,arr2);
        for(int i=0; i<result.length(); i++){
            System.out.println(result.charAt(i));
        }

    }
}