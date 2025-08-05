package Sector2_Array.문제4_피보나치_수열;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_non_array {
    public void solution (int n){
        int a =1, b = 1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }



    public static void main(String[] args) {
        Main_non_array T =new  Main_non_array();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();


       T.solution(n);

    }
}