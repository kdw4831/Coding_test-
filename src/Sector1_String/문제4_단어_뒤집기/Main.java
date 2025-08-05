package Sector1_String.문제4_단어_뒤집기;

import java.util.*;

public class Main {
    public String[] solution (String[] strArr){
        int len= strArr.length;
        for(int i =0; i<len; i++){
            int idx =strArr[i].length()-1;
            char[] charArr= new char[strArr[i].length()];
            for(char tmp : strArr[i].toCharArray()){
                charArr[idx]= tmp;
                idx--;
            }
            strArr[i]="";
            for(char tmp2 : charArr){
                strArr[i]+=tmp2;
            }
        }


        return strArr;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);

        int n = Integer.parseInt(kb.nextLine());
        String[] strArr= new String[n];
        for(int i=0; i<n; i++){
            strArr[i]= kb.nextLine();

        }
        for(String tmp : T.solution(strArr)){
            System.out.println(tmp);
        }

    }
}