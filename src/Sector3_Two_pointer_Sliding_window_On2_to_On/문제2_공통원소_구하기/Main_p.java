package Sector3_Two_pointer_Sliding_window_On2_to_On.문제2_공통원소_구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_p {
    public List<Integer> solution (int n,int m ,int[] arr1, int[] arr2){
        List<Integer> answer= new ArrayList<>();
        int lt=0, rt=0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(lt<n && rt<m){
            if(arr1[lt] == arr2[rt]){
                answer.add(arr1[lt]);
                lt++;
                rt++;
            }else if( arr1[lt]< arr2[rt])lt++;
            else rt++;
        }




        return answer;
    }

    public static void main(String[] args) {
        Main_p T =new Main_p();
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