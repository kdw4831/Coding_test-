package Sector1_String.문제9_숫자만_추출;

import java.util.Scanner;

public class Main {
    public int solution (String str){
        int answer=0;
        str = str.replaceAll("[^0-9]","");
        StringBuilder sb = new StringBuilder(str);
        if(sb.charAt(0)=='0'){ // parseInt 메서드는 0208 => 208로 바꿔줌
            sb.delete(0,1);    // 그래서 이 조건문은 생략이 가능하다.
        }
        answer = Integer.parseInt(sb.toString());

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}