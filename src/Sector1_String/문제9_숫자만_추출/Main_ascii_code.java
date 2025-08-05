package Sector1_String.문제9_숫자만_추출;

import java.util.Scanner;
// 아스키 코드에서 숫자 문자열 0~9는 48~57이다.
// 이 함수는 실제로 Integer.parseInt 메서드 동작 방식이다.
public class Main_ascii_code {
    public int solution (String str){
        int answer=0;
        char[] charArr= str.toCharArray();
        for(char tmp : charArr){
            if(tmp>=48 && tmp<=57) answer=answer*10+tmp-48;
        }



        return answer;
    }
    public static void main(String[] args) {
        Main_ascii_code T =new Main_ascii_code();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));

    }
}