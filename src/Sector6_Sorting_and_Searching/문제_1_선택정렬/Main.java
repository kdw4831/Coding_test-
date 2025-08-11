package Sector6_Sorting_and_Searching.문제_1_선택정렬;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {


    public int[] solution (int[] arr){
        int[] answer = new int[arr.length];
        Arrays.sort(arr);


        return arr;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int i : T.solution(arr)){
            System.out.print(i+" ");
        }

    }
}