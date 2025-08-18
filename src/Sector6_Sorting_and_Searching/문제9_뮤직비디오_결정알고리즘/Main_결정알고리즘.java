package Sector6_Sorting_and_Searching.문제9_뮤직비디오_결정알고리즘;


import java.util.Arrays;
import java.util.Scanner;


public class Main_결정알고리즘 {
    int count(int[] arr, int capacity){
        int bucket=1;
        int sum=0;
        for(int tmp : arr){
            if(sum+tmp>capacity){
                bucket++;
                sum=tmp;
            }else sum+=tmp;
        }
        return bucket;
    }
    //결정 알고리즘은 더 좋은 답을 찾아가는 과정
    public int solution ( int m, int[] arr){

        int answer =0;
        int lt= Arrays.stream(arr).max().getAsInt();
        int rt= Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=m){
                answer=mid;
                rt=mid-1;
            }else{
                lt=mid+1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Main_결정알고리즘 T =new Main_결정알고리즘();
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