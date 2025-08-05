package Sector1_String.문제8_유효한_팰린드롬;

import java.util.*;

public class Main {
    public String solution (String str){
        String answer="NO", alpaStr="";

        for(int i =0; i< str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))) alpaStr+= str.charAt(i);
        }

        StringBuilder sb = new StringBuilder(alpaStr);

        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())) return "YES";



        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}