package Sector7_Recursive_Tree_Graph.문제11_경로_탐색_인접행렬;

import java.util.Scanner;

public class Main {
    int[] ch =new int[21];

    static int cnt;
    public void DFS(int[][] arr,int n, int init ){
        if(init==n) cnt++;
        else{


            for(int i=1; i<=n; i++){

                if(arr[init][i]==1 && ch[i]!=1){
                    ch[i]=1;
                    DFS(arr,n,i);
                    ch[i]=0;
                }

            }


        }

    }
    public static void main(String[] args){
        Main T = new Main();
        cnt =0;
        T.ch[1]=1;
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int init =1;
        int[][] arr = new int[n+1][m+1];
        for(int i=0; i<m; i++){
            arr[kb.nextInt()][kb.nextInt()]=1;
        }
        T.DFS(arr,n,init);
        System.out.println(cnt);
    }
}
