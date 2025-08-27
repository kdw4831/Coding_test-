package Sector7_Recursive_Tree_Graph.문제1_재귀함수;


public class Main_재귀_스택프레임_p {
    public void DFS(int n){

        if(n>0){
            DFS(n-1);
            System.out.print(n+" ");
        }
    }


    public static void main(String[] args) {
        Main_재귀_스택프레임_p T =new Main_재귀_스택프레임_p();
        T.DFS(3);

    }
}