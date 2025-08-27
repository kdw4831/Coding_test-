package Sector7_Recursive_Tree_Graph.문제8_송아지_찾기_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {

    //BFS를 사용할 땐 머다 ? 최단거리이다.
    public int BFS(int s, int e){
        int answer=0;
        int[] dis = {1,-1,5};
        int[] ch = new int[10001];
        int L=0;
        ch[s]=1;

        Queue<Integer> q = new LinkedList<>();
        q.offer(s);

        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int cur = q.poll();

                for(int j=0; j<dis.length; j++){
                    int nCur=cur+dis[j];
                    if(nCur==e) return L+1;
                    if(nCur>=1&&nCur<=10000&&ch[nCur]==0){
                        ch[nCur]=1;
                        q.offer(nCur);
                    }
                }
            }
            L++;

        }

        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int s= kb.nextInt();
        int e= kb.nextInt();
        System.out.println(T.BFS(s,e));
    }

}
