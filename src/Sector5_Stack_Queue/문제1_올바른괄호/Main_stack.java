package Sector5_Stack_Queue.문제1_올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main_stack {
    public String solution (String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char tmp : str.toCharArray()){
            if(tmp=='(') stack.push(tmp);
            else{
                if(stack.isEmpty())return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty())return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Main_stack T =new Main_stack();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}