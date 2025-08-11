package Sector5_Stack_Queue.문제4_후위식연산_postfix;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public int solution (String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        //아스키 코드에서 숫자 0 은 48이다.
        int lt,rt;
        for(char x : str.toCharArray()){
            if(Character.isDigit(x))stack.push(x-48);
            else{
                rt=stack.pop();
                lt=stack.pop();
                if(x=='+'){
                    stack.push(lt+rt);
                }else if(x=='-'){
                    stack.push(lt-rt);
                }else if(x=='*'){
                    stack.push(lt*rt);
                }else if(x=='/'){
                    stack.push(lt/rt);
                }
            }
        }


        answer=stack.get(0);
        

        return answer;
    }
    public static void main(String[] args) {
        Main2 T =new Main2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}