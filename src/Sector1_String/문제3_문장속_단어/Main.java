package Sector1_String.문제3_문장속_단어;

import java.util.*;


public class Main {
    public String solution (String str){
        String answer=null;
        int max =0;
        String[] strArr = str.split(" ");


        for (String s : strArr) {
            if (s.length() > max) {
                max = s.length();
                answer = s;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}