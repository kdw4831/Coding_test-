package Sector7_Recursive_Tree_Graph.문제3_팩토리얼;


public class Main {
    public int DFS(int n){
        // 어차피 곱셈이기에 0 일 때 1이여도 문제가 되진 않지만
        // 1 일 때 1인 경우가 훨씬 더 합리적인 것 같다.
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args){
        Main T = new Main();
        System.out.println(T.DFS(5));
    }

}