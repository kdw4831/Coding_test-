package Sector5_Stack_Queue.문제2_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution (String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char tmp : str.toCharArray()){
            if(tmp==')'){
                while(stack.pop()!='(');
            }else{
                stack.push(tmp);
            }
        }
        for(char tmp : stack){
            answer+=tmp;
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