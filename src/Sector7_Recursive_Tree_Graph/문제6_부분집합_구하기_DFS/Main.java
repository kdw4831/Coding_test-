package Sector7_Recursive_Tree_Graph.문제6_부분집합_구하기_DFS;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] ch ;
    public void DFS(int L){
        if(L==n+1) {
            for(int i=0; i<n+1; i++){
                if(ch[i]==1){
                    System.out.print(i+" ");
                }
            }
            System.out.println();

        }
        else{
            ch[L]=1;
            DFS(L+1);

            ch[L]=0;
            DFS(L+1);
        }
    }
    public static void main(String[] args){
        Main T= new Main();
        Scanner kb= new Scanner(System.in);
        n = kb.nextInt();
        ch= new int[n+1];
        T.DFS(1);
    }
}
