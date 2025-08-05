package Sector1_String.문제5_특정_문자_뒤집기;

import java.util.Scanner;

public class Main {
    public String solution (String str){
        String answer="";
        char[] arr = str.toCharArray();
        int lt = 0 , rt = arr.length-1;

        while (lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }

        }

        answer = String.valueOf(arr);
        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}