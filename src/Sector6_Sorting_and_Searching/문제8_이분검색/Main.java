package Sector6_Sorting_and_Searching.문제8_이분검색;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public int solution ( int m, int[] arr){
        int answer =0;
        Arrays.sort(arr);
        for(int tmp: arr){
            answer++;
            if(tmp==m)break;

        }


        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }

        System.out.println(T.solution(m,arr));


    }
}