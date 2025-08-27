package Sector7_Recursive_Tree_Graph.문제8_송아지_찾기_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    //BFS를 사용할 땐 머다 ? 최단거리이다.
    public int BFS(int s, int e){
        int answer =0;
        Queue<Integer> q = new LinkedList<>();
        int[] dis ={-1,1,5};
        int[] ch = new int[10001];
        int L=0;
        ch[s]=1;
        q.offer(s);
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int tmp = q.poll();
                for(int x : dis){
                    int nx= tmp+x;
                    if(nx ==e)return L+1;
                    if(nx>=1&& nx<=10000&&ch[nx]==0)q.offer(nx);
                    ch[nx]=1;
                }
            }

            L++;
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s= kb.nextInt();
        int e= kb.nextInt();
        System.out.println(T.BFS(s,e));
    }

}
