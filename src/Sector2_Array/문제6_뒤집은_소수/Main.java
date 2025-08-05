package Sector2_Array.문제6_뒤집은_소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution (int n, int[] arr){
        ArrayList<Integer>answer = new ArrayList<>();

        // 역순으로 돌리고
        for(int i=0; i<n; i++){
            String reverse=new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            arr[i]=Integer.parseInt(reverse);
        }

        // 소수를 찾아내서 answer에 더한다.
        for(int i=0; i<n; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(arr[i]); j++){
                if(arr[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(arr[i]==1)isPrime=false;
            if(isPrime)answer.add(arr[i]);
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



        for(int x:T.solution(n,arr)){
            System.out.print(x+" ");
        }

    }
}