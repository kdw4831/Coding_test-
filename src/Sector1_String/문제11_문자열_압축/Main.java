package Sector1_String.문제11_문자열_압축;

import java.util.Scanner;

public class Main {
    public String solution (String str){
         StringBuilder answer = new StringBuilder();
         int count = 0;
         StringBuilder sb = new StringBuilder(str);
         sb.append(" ");

         for(int i=0; i<sb.length(); i++){
             count=1;
             answer.append(sb.charAt(i));
             for(int j=i+1; j<sb.length(); j++) {
                 if (sb.charAt(i) != sb.charAt(j)) {
                     if(count>1)answer.append(count);
                     i+= j-i-1;
                    break;
                 }
                 count++;


             }


         }
        return answer.toString();
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}