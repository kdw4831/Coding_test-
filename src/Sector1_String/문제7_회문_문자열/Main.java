package Sector1_String.문제7_회문_문자열;

import java.util.*;

public class Main {
    public String solution (String str){
        String answer = "YES";
       /*
        int lt = 0, rt = str.length()-1;

        while(lt<rt){
            //System.out.println(Character.toUpperCase(str.charAt(lt))+" : "+Character.toUpperCase(str.charAt(rt)));

            if(Character.toUpperCase(str.charAt(lt)) !=
                    Character.toUpperCase(str.charAt(rt))){
                answer="NO";
            }
            lt++;
            rt--;
        }
        */
        // 두 번째 방법
        str = str.toUpperCase(); // 문자열에서도 대소문자로 바꿔주는 메서드가 존재한다.
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return "NO";
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