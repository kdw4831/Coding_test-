package Sector6_Sorting_and_Searching.문제3_삽입정렬;


import java.util.Scanner;


public class Main {
    public int[] solution (int[] arr){
        for(int i=1; i<arr.length; i++){
            int tmp=arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp)arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
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