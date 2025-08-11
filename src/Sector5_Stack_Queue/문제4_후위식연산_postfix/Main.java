package Sector5_Stack_Queue.문제4_후위식연산_postfix;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution (String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();


        for(char tmp : str.toCharArray()){
            if(Character.isDigit(tmp)){
                stack.push(Integer.parseInt(String.valueOf(tmp)));
            }else{
                 if(tmp=='+'){
                     stack.push(stack.pop()+stack.pop());

                 }else if(tmp=='-'){
                     int a=stack.pop();
                     int b=stack.pop();
                     stack.push(b-a);

                 }else if(tmp=='*'){
                     stack.push(stack.pop()*stack.pop());

                 }else{
                     int a=stack.pop();
                     int b=stack.pop();
                     stack.push(b/a);
                 }
            }
        }

        answer=stack.pop();



        

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}