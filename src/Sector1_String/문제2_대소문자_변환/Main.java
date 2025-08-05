package Sector1_String.문제2_대소문자_변환;

import java.util.*;

public class Main {

    public String solution (String str){
        String answer="";
        char[] charArr =str.toCharArray();
        for(char c : charArr){
            /* 내가 푼 방법
                if(Character.isUpperCase(c)){
                    c = Character.toLowerCase(c);
                }else{
                    c = Character.toUpperCase(c);
                }
                answer+=Character.toString(c);
             */
            // 아스키 코드를 사용해서 해볼까?
            // 대문자는 65~96 소문자는 97~122다. 각각의 차이는 32
            if(c >= 97 && c <= 122) answer += (char)(c-32);
            else answer += (char)(c+32);
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