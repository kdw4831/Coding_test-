package Sector5_Stack_Queue.문제7_교육과정_설계;


import java.util.*;

public class Main {
    public String solution (String str1 , String str2){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(int i=0; i< str1.length(); i++){
            Q.offer(str1.charAt(i));
        }


        for(char tmp: str2.toCharArray()){
            if(Q.contains(tmp)){
                if(Q.peek()==tmp)Q.poll();
                else return "NO";
                //한방에 끝내는 법
                //if(tmp!=Q.poll())return "NO";
            }
        }

        if(!Q.isEmpty())return "NO";


        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();

        System.out.println(T.solution(str1,str2));
    }
}