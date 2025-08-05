package Sector1_String.문제10_가장_짧은_거리;

import java.util.Scanner;

public class Main {
    public String solution (String str, char t){
        StringBuilder answer= new StringBuilder();
        char[] charArr= str.toCharArray();

        for(int i=0; i< charArr.length; i++){

            int lt_dis = new StringBuilder(str.substring(0,i+1)).reverse().toString().indexOf(t);
            int rt_dis = str.substring(i).indexOf(t);
            //System.out.println(lt_dis);
            //System.out.println(rt_dis);
            if(charArr[i] == t) answer.append(0+" ");
            else if(lt_dis<rt_dis && lt_dis>=0) answer.append(lt_dis).append(" ");
            else if(rt_dis == -1) answer.append(lt_dis).append(" ");
            else answer.append(rt_dis).append(" ");
        }

        return  answer.toString();
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String[] arr=str.split(" ");
        String s = arr[0];
        char c = arr[1].charAt(0);
        System.out.println(T.solution(s,c));
    }
}