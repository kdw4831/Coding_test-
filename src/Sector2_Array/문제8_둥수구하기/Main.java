package Sector2_Array.문제8_둥수구하기;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public int[] solution (int n, int[] arr){
        int[] answer= new int[n];
        int[] cloneArr= arr.clone();
        Arrays.sort(cloneArr);
        cloneArr = Arrays.stream(cloneArr).distinct().toArray();

        int cnt=1;
        int rank=1;

        for(int j=cloneArr.length-1; j>=0; j--){ // 4 3 2 1 0 총 5번   1 2 2 3 4
            for(int i=0; i<n; i++) {
                if (cloneArr[j]==arr[i]) {
                    answer[i]=rank;
                    cnt++;
                }
            }
            rank=cnt;
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

        for(int x:T.solution(n,arr)) System.out.print(x+" ");
    }
}