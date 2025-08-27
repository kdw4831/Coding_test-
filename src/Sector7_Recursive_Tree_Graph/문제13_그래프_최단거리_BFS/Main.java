package Sector7_Recursive_Tree_Graph.문제13_그래프_최단거리_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;

    static int[] edge;

    public void BFS(int v){
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        int L = 1;
        q.offer(graph.get(v));
        while(!q.isEmpty()){
            int len= q.size();
            for(int i=0; i<len; i++){
                ArrayList<Integer> cur = q.poll();

                for(int nv : cur){
                    if(edge[nv]==0){
                        q.offer(graph.get(nv));
                        edge[nv]=L;
                    }

                }
            }
            L++;
        }

    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();




        edge = new int[n+1];
        edge[1]=1;
        graph= new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            graph.get(kb.nextInt()).add(kb.nextInt());
        }

        T.BFS(1);

        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+edge[i]);
        }

    }
}
