package Sector7_Recursive_Tree_Graph.문제10_트리_말단노드까지의_짧은경로_BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int Data;
    Node lt , rt;
    public Node(int val){
        Data=val;
        lt=rt=null;
    }
}

public class Main {
    Node root;

    public int BFS( Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L=0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                Node cur= q.poll();
                if(cur.lt==null && cur.rt==null){
                    return L;
                }
                if(cur.lt!=null)q.offer(cur.lt);
                if(cur.rt!=null)q.offer(cur.rt);
            }

            L++;

        }
        return L;

    }
    public static void main(String[] args){
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt= new Node(2);
        T.root.rt= new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.BFS(T.root));

    }
}
