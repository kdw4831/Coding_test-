package Sector6_Sorting_and_Searching.문제1_선택정렬;


import java.util.Scanner;


public class Main2 {
    //선택 정렬은 배열을 순회하면서 가장 작은 값을 배열의 맨 앞과 교환하며 동작한다.
    public int[] solution (int[] arr){
      for(int i=0; i<arr.length-1; i++){
          int idx=i;
          for(int j=i+1; j<arr.length; j++){
              if(arr[idx]>arr[j]){
                  idx=j;
              }
          }
          int tmp = arr[i];
          arr[i]= arr[idx];
          arr[idx]=tmp;
      }


        return arr;
    }

    public static void main(String[] args) {
        Main2 T =new Main2();
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