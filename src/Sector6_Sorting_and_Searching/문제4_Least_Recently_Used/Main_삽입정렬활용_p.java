package Sector6_Sorting_and_Searching.문제4_Least_Recently_Used;


import java.util.Scanner;


public class Main_삽입정렬활용_p {
    public int[] solution (int k , int[] arr){
        int[] answer= new int[k];
        for(int i=0; i< arr.length; i++){
            int pos=-1;
            for(int j=0; j<k; j++)if(arr[i]==answer[j])pos=j;
            if(pos ==-1){
                for(int j=k-1; j>=1; j--){
                    answer[j]=answer[j-1];
                }
            }else{
                for(int j=pos; j>=1; j--){
                    answer[j]=answer[j-1];
                }
            }
            answer[0]=arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_삽입정렬활용_p T =new Main_삽입정렬활용_p();
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