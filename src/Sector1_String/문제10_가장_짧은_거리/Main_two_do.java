package Sector1_String.문제10_가장_짧은_거리;

import java.util.*;

public class Main_two_do {
    public int[] solution (String str, char t){
        int[] answer = new int[str.length()];
        int p = 1000;
        // 왼쪽에 있는것만 보고
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == t){
                answer[i] = 0;
                p=0;
            }else{
                answer[i] = ++p;
            }
        }
        // 오른 쪽에 있는 것만 봐서
        p = 1000;
        str = new StringBuilder(str).reverse().toString();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == t){
                p=0;
            }else if(answer[str.length()-1-i]>++p) answer[str.length()-1-i]=p;
            //그냥  else 로 했다고 했을 때는 math라이브러리를 사용한다. 이건 합리적이다.
            // else answer[str.length()-1-i] = Math.min(answer[str.length()-1-i],++p);

        }

        // 배열을 리턴한다

        return  answer;
    }
    public static void main(String[] args) {
        Main_two_do T =new Main_two_do();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(s +" : "+ c);
        for(int tmp : T.solution(s,c)) System.out.print(tmp+" ");
    }
}