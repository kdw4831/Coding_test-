package Sector1_String.문제3_문장속_단어;
import java.util.*;

public class Main_index_of_substring {
    public String solution (String str){
        String answer ="";
        int max = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(" ")) != -1 ){
            String tmp =str.substring(0,pos);
            int len = tmp.length();
            if(len>max){
                answer= tmp;
                max = len;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) answer = str;

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}