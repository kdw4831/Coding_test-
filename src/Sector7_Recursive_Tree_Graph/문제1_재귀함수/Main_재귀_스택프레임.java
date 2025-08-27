package Sector7_Recursive_Tree_Graph.문제1_재귀함수;


public class Main_재귀_스택프레임 {

    public void DFS ( int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.println(n-1);
        }

    }

    public static void main(String[] args) {
        Main_재귀_스택프레임 T =new Main_재귀_스택프레임();
        T.DFS(3);

    }
}