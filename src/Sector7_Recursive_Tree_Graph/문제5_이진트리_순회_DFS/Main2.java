package Sector7_Recursive_Tree_Graph.문제5_이진트리_순회_DFS;

import com.sun.source.tree.Tree;

class Node2{
    int data;
    Node2 lt ,rt;
    public Node2(int val){
        data= val;
        lt=rt=null;
    }
}
public class Main2 {
    Node2 root;


    public void DFS(Node2 root){
        if(root==null)return;
        else{

            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
        }

    }
    public static void main(String[] args){
        Main2 tree= new Main2();
        tree.root=new Node2(1);
        tree.root.lt= new Node2(2);
        tree.root.rt= new Node2(3);
        tree.root.lt.lt= new Node2(4);
        tree.root.lt.rt= new Node2(5);
        tree.root.rt.lt= new Node2(6);
        tree.root.rt.rt= new Node2(7);

        tree.DFS(tree.root);
    }
}
