package Sector5_Stack_Queue.문제6_공주구하기;

import java.util.*;

public class Main {
    public int solution (int n, int k){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++){
            q.offer(i);
        }


        int cnt=0;
        while (q.size() != 1) {
            cnt++;
            if(cnt == k){
                q.poll();
                cnt=0;
            }else q.offer(q.poll());

        }
        answer = q.poll();



        

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        System.out.println(T.solution(n,k));
    }
}