package Sector2_Array.문제4_피보나치_수열;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution (int n){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(i==0 || i==1) answer.add(1);
            else answer.add(answer.get(i-2)+answer.get(i-1));
        }

        return answer;
    }



    public static void main(String[] args) {
        Main T =new  Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();


        for(int x : T.solution(n)) System.out.print(x+" ");

    }
}