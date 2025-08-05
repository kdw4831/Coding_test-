package Sector1_String.문제8_유효한_팰린드롬;

import java.util.*;

public class Main_replaceAll {
    public String solution (String str){
        String answer="NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");

        StringBuilder sb = new StringBuilder(str);
        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())) answer = "YES";

        return answer;
    }
    public static void main(String[] args) {
        Main_replaceAll T =new Main_replaceAll();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}