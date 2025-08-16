package Sector6_Sorting_and_Searching.문제4_Least_Recently_Used;


import java.util.*;


public class Main {
    public List<Integer> solution (int k , int[] arr){

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<k; i++)q.offer(arr[i]);

        for(int i=k; i<arr.length; i++){
            if(q.contains(arr[i])){
                q.remove(arr[i]);
                q.offer(arr[i]);
            }else{
                q.poll();
                q.offer(arr[i]);
            }
        }
        List<Integer> answer = new ArrayList<>(q);

        Collections.reverse(answer);

        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);

        int k = kb.nextInt();

        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
       for(int tmp : T.solution(k,arr)) System.out.println(tmp+" ");

    }
}