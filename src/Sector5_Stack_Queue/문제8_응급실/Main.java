package Sector5_Stack_Queue.문제8_응급실;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Main {

    class Person {
        int id;
        int status;
        public Person(int id, int status){
            this.id=id;
            this.status =status;
        }
    }
    public int solution (int m , int[] arr){
        int answer=0;
        Queue<Person> q = new LinkedList<>();

        for(int i=0; i<arr.length; i++){
            q.offer(new Person(i,arr[i]));
        }

        while(!q.isEmpty()){
            Person p = q.poll();
            for(Person tmp: q){
                if(tmp.status > p.status){
                    q.offer(p);
                    p=null;
                    break;
                }
            }
            if(p!=null){
                answer++;
                if(p.id==m) return answer;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(m,arr));
    }
}