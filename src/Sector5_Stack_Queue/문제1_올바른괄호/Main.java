package Sector5_Stack_Queue.문제1_올바른괄호;

import java.util.Scanner;

public class Main {
    public String solution (String str){
        String answer = "YES";

        int lt=0, rt=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(')lt++;
            else rt++;
        }


        if(lt!=rt || str.charAt(str.length()-1)=='(')return "NO";





        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}