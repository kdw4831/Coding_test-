package Sector1_String.문제7_회문_문자열;


import java.util.*;

public class Main_Stringbuilder {
    public String solution (String str){
        String answer = "YES";
        StringBuilder sb = new StringBuilder(str);
        if(!sb.toString().equalsIgnoreCase(sb.reverse().toString())) return "NO";


        return answer;
    }
    public static void main(String[] args) {
        Main_Stringbuilder T =new Main_Stringbuilder();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}