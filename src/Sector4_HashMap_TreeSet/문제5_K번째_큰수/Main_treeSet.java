package Sector4_HashMap_TreeSet.문제5_K번째_큰수;

import java.util.*;

public class Main_treeSet {
    public int solution (int n , int k, int[] arr){
        int answer=0;
        TreeSet<Integer> t_set = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l= j+1; l<n; l++){
                    t_set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        t_set.remove(143); // 저장된 143 값을 지워버림
        t_set.size(); // 배열길이
        t_set.first(); // 가장 첫 번째 값;
        t_set.last();// 가장 마지막 값

       if(t_set.size()<k-1) return -1;

       int cnt=0;
       for(int tmp : t_set){
           cnt++;
           if(cnt==k)answer=tmp;
       }




        return answer;
    }
    public static void main(String[] args) {
        Main_treeSet T =new Main_treeSet();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }



        System.out.println(T.solution(n,k,arr));
    }
}