package Sector2_Array.문제5_소수_에라토스테네스_체;

import java.util.Scanner;



public class Main_에라토스테네스체 {
    public int solution (int n){
        int answer=0;
        int[] arr = new int[n+1];

        for(int i=2; i< arr.length; i++){
            if(arr[i]==0){
                answer++;
                // j는 i의 배수로 돌아야되니까 i씩 증가한다.
                for(int j=i; j<arr.length; j=j+i ){
                    if(j%i==0)arr[j]=1;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main_에라토스테네스체 T =new Main_에라토스테네스체();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}