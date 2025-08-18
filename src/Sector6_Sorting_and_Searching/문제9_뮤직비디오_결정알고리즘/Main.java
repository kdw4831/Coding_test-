package Sector6_Sorting_and_Searching.문제9_뮤직비디오_결정알고리즘;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public int solution ( int m, int[] arr){
        int answer =0;

        boolean isflag = false;
        /*
            m개의 dvd안에 넣어야된다고 생각했을 때
            각 dvd가 최소용량을 가져야됨 그때의 값을 구해라

         */
        //1. 값을 다 더해서 m으로 나눔 => k라고 할 때
         for(int tmp : arr){
             answer+=tmp;
         }
         answer=answer/m;

        // k가 최소이므로 가능한 한 담고 안되면 1증가 반복
        while(!isflag){
            int bucket = 1;
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum +=arr[i];
                if(sum>answer){

                    bucket++;
                    sum=arr[i];

                }

            }
            if(bucket==m){
                isflag=true;
            }else answer++;



        }

        //다 담기면 리턴 그 값을 answer로  어때 지리지


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