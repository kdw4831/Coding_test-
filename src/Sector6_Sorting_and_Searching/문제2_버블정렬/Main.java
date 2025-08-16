package Sector6_Sorting_and_Searching.문제2_버블정렬;


import java.util.Scanner;


public class Main {
    //선택 정렬은 배열을 순회하면서 가장 작은 값을 배열의 맨 앞과 교환하며 동작한다. 
    public int[] solution (int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
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