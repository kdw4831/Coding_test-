package Sector3_Two_pointer_Sliding_window_On2_to_On.문제1_두배열_합치기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public int[] solution (int n,int m ,int[] arr1, int[] arr2){
        int[] answer= new int[n+m];
        List<Integer> arr= new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(arr1[i]);
        }
        for(int i=0; i<m; i++){
            arr.add(arr2[i]);
        }
        for(int i=0; i<n+m; i++){
            answer[i]=arr.get(i);
        }
        Arrays.sort(answer);



        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=kb.nextInt();
        }
        for(int tmp:T.solution(n,m,arr1,arr2) ){
            System.out.print(tmp+" ");
        }

    }
}