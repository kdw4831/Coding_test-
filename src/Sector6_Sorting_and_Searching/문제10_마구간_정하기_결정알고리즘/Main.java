package Sector6_Sorting_and_Searching.문제10_마구간_정하기_결정알고리즘;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
    //말의 개수를 의미한다.
    public int count(int[] arr, int mid){
        //end point
        int ep=arr[0];
        int count=1;
        for(int tmp :arr){
            if(mid<=tmp-ep){
                ep=tmp;
                count++;
            }
        }

        return count;
    }
    public int solution ( int c, int[] arr){
        int answer =0;
        //lt 와 rt를 거리로 생각한다. 이진 탐색과 결정알고리즘
        Arrays.sort(arr);
        int lt =1, rt = arr[arr.length-1];

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)>=c){
                answer=mid;
                lt=mid+1;
            }else rt =mid-1;
        }



        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }

        System.out.println(T.solution(c,arr));


    }
}