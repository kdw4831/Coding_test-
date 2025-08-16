package Sector6_Sorting_and_Searching.문제5_중복확인;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main_정렬활용 {
    public String solution (int[] arr){
        String answer="U";
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1])return "D";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_정렬활용 T =new Main_정렬활용();
        Scanner kb = new Scanner(System.in);



        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(arr));

    }
}