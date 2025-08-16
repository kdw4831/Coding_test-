package Sector6_Sorting_and_Searching.문제8_이분검색;


import java.util.Arrays;
import java.util.Scanner;


public class Main_이분검색 {

    public int solution ( int m, int[] arr){
        int answer =0;
        int lt=0 , rt=arr.length-1;

        Arrays.sort(arr);

        while(true){ // 조건이 lt<=rt 일때도 정지할 수 있겠지
            int mid = (lt+rt)/2;
            if(arr[mid] == m){
                answer=mid+1;
                break;
            }else if(arr[mid]>m){
                rt=mid-1;
            }else{
                lt=mid+1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Main_이분검색 T =new Main_이분검색();
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