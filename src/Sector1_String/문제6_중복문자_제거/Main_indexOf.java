package Sector1_String.문제6_중복문자_제거;
import java.util.*;

public class Main_indexOf {
    public String solution (String str){
        // 중복 문자를 제거할 때는 indexOf를 사용하면 간단하게 할 수 있다.
        // indexOf같은 경우에는 중복 되는 첫 번째 문자열의 위치를 반환한다.
        // 이를 활용해서 즉 indexOf가 반환하는 위치와 실제 문자열의 위치가 동일하다면
        // 그걸 answer에 누적시켜서 중복문자를 제거한 답을 얻을 수 있다.
        String answer="";

        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }

        return answer;

    }


    public static void main(String[] args) {
        Main_indexOf T =new Main_indexOf();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}