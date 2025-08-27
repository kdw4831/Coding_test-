package Sector7_Recursive_Tree_Graph.문제7_이진트리_순회;



import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt,rt;
    public Node(int val){
        data= val;
        lt=rt=null;
    }
}
public class Main {


    Node root;
    public void BFS(Node root){
        Queue<Node> q= new LinkedList<>();
        int L=0;
        q.offer(root);
        while(!q.isEmpty()){
            System.out.print("level: "+L+" value: ");
            int len = q.size();
            for(int i=0; i<len; i++){
                Node cur= q.poll();
                System.out.print(cur.data+ " ");
                if(cur.lt !=null) q.offer(cur.lt);
                if(cur.rt !=null) q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }





    }

    public static void main(String[] args){
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt=new Node(4);
        T.root.lt.rt= new Node(5);
        T.root.rt.lt= new Node(6);
        T.root.rt.rt= new Node(7);


        T.BFS(T.root);
    }
}
