package Sector7_Recursive_Tree_Graph.문제12_경로_탐색_인접리스트;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;


    public void DFS(int v ){
        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }

    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n+1];

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
          graph.get(kb.nextInt()).add(kb.nextInt());
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
