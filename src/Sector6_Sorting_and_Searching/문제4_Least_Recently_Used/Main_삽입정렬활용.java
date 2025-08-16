package Sector6_Sorting_and_Searching.문제4_Least_Recently_Used;


import java.util.*;


public class Main_삽입정렬활용 {
    public int[] solution (int k , int[] arr){
        int[] answer= new int[k];
        for(int x: arr){
            int pos= -1;
            for(int i=0; i<k; i++)if(x==answer[i])pos=i;

            if(pos==-1){
                for(int i=k-1; i>=1; i--){
                    answer[i]=answer[i-1];
                }
                answer[0]=x;
            }else{// hit인 경우
                for(int i=pos; i>=1; i--){
                    answer[i]=answer[i-1];
                }
                answer[0]=x;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main_삽입정렬활용 T =new Main_삽입정렬활용();
        Scanner kb = new Scanner(System.in);

        int k = kb.nextInt();

        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
       for(int tmp : T.solution(k,arr)) System.out.print(tmp+" ");

    }
}