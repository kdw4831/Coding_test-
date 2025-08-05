package Sector1_String.문제1_문자찾기;

import java.util.*;

public class Main {
    public int solution (String str, char t){
        int answer=0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//       char[] arr = str.toCharArray();
//        for( char c : arr){
//            if(c==t){
//
//                answer++;
//            }
//        }

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str,c));
    }
}
