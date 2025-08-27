package Sector7_Recursive_Tree_Graph.문제11_경로_탐색_인접행렬;

import java.util.Scanner;

public class Main_p {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;


    public void DFS(int v ){
        if(v==n)answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }

    }
    public static void main(String[] args){
        Main_p T = new Main_p();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][m+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            graph[kb.nextInt()][kb.nextInt()]=1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
