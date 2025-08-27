package Sector7_Recursive_Tree_Graph.문제1_재귀함수;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    int cnt=1;
    public int reculsive(int n){
        if(cnt<n){
            System.out.print(cnt+" ");
            cnt++;
            return reculsive(n);
        }
        System.out.println(n);
        return 0;
    }
    public int solution ( int n){
        int answer =0;

        reculsive(n);

        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();


       T.solution(n);

    }
}