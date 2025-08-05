package Sector1_String.문제6_중복문자_제거;

import java.util.*;

public class Main {
    public String solution (String str){
        String answer="";
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.delete(j, j + 1);
                    j--;
                }
            }
        }

        answer = sb.toString();
        return answer;

    }


    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}