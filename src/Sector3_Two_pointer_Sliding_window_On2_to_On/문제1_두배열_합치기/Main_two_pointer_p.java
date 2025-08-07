package Sector3_Two_pointer_Sliding_window_On2_to_On.문제1_두배열_합치기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_two_pointer_p {
    public List<Integer> solution (int n,int m ,int[] arr1, int[] arr2){
       List<Integer> answer = new ArrayList<>();
       int lt=0, rt=0;

       while(lt<n && rt<m){
           if(arr1[lt]<arr2[rt])answer.add(arr1[lt++]);
           else answer.add(arr2[rt++]);
       }

       while(lt<n)answer.add(arr1[lt++]);
       while(rt<m)answer.add(arr2[rt++]);


       return answer;
    }

    public static void main(String[] args) {
        Main_two_pointer_p T =new Main_two_pointer_p();
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