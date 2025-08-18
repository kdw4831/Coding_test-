package Sector6_Sorting_and_Searching.문제9_뮤직비디오_결정알고리즘;


import java.util.Arrays;
import java.util.Scanner;


public class Main_결정알고리즘_p {

    //결정 알고리즘은 더 좋은 답을 찾아가는 과정
    //문제를 보면 수용량의 제한이 없다면 답이 여러개가 될 수 있어
    //근접한 답을 찾아가야돼 최소로 이때 결정알고리즘을 많이 사용한다.
    // 동시에 결정알고리즘을 이분탐색으로 구현한다.

    public int count(int[] arr,int capacity){
        int sum=0;
        int bucket=1;
        for(int tmp : arr ){
            if(sum+tmp>capacity){
                bucket++;
                sum=tmp;
            }else sum+=tmp;
        }
        return bucket;
    }

    public int solution ( int m, int[] arr){
        int answer=0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=m){
                rt=mid-1;
                answer=mid;
            }else lt=mid+1;

        }


        return answer;
    }

    public static void main(String[] args) {
        Main_결정알고리즘_p T =new Main_결정알고리즘_p();
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