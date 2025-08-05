package Sector1_String.문제9_숫자만_추출;

import java.util.Scanner;

public class Main_isDigit {
    public int solution (String str){
        String answer="";
        for(char tmp : str.toCharArray()){
            if(Character.isDigit(tmp)) answer+=tmp;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        Main_isDigit T =new Main_isDigit();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}