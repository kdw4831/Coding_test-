package Sector5_Stack_Queue.문제5_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution (String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(')stack.push(str.charAt(i));
            else{
                if(i-1>=0 && str.charAt(i-1)=='('){
                    if(str.charAt(i)==')'){
                        stack.pop();
                        answer+=stack.size();
                    }
                }else{
                    stack.pop();
                    answer+=1;
                }

            }

        }


        

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}