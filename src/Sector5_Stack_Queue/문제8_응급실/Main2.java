package Sector5_Stack_Queue.문제8_응급실;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main2 {
    class Person{
        int id;
        int status;

        public Person(int id , int status){
            this.id= id;
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
            boolean flag =true;
            for(Person tmp : q){
                if(tmp.status > p.status){
                    q.offer(p);
                    flag=false;
                    break;
                }
            }
            if(flag){
                answer++;
                if(p.id==m){
                    return answer;
                }
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Main2 T =new Main2();
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