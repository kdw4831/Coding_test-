package Sector7_Recursive_Tree_Graph.문제4_피보나치_수열_메모제이션;


public class Main2 {
    static int[] fibo;
    public int DFS(int n){
      if(n==1) return fibo[n]=1;
      else if(n==2) return fibo[n]=1;
      else return fibo[n]= DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        int n=10;
        fibo= new int[n+1];// 1~10까지 넣어야되니까
        T.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");


    }

}