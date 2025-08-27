package Sector7_Recursive_Tree_Graph.문제7_이진트리_순회;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node2 lt, rt;
    public Node2(int val){
        data= val;
        lt=rt=null;
    }
}
public class Main2 {
    Node2 root;
    public void BFS(Node2 root){
        Queue<Node2> q = new LinkedList<>();
        int L = 0;
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            System.out.print("level: " +L +", value: ");
            for(int i=0; i<len; i++){
                Node2 cur = q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt != null)q.offer(cur.lt);
                if(cur.rt != null)q.offer(cur.rt);
            }
            System.out.println();
            L++;
        }

    }
    public static void main(String[] args){
        Main2 T = new Main2();
        T.root= new Node2(1);
        T.root.lt= new Node2(2);
        T.root.rt= new Node2(3);
        T.root.lt.lt = new Node2(4);
        T.root.lt.rt = new Node2(5);
        T.root.rt.lt = new Node2(6);
        T.root.rt.rt = new Node2(7);
        T.BFS(T.root);
    }
}
