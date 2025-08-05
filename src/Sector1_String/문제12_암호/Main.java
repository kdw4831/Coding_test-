package Sector1_String.문제12_암호;

import java.util.Scanner;

public class Main {
    public String solution (int n, String str){
        String answer="";


        int bi[] = new int[n];

        str=str.replace("#","1")
                .replace("*","0");
        StringBuilder sb = new StringBuilder(str);

        for(int i =0; i<n; i++){
            bi[i]=Integer.parseInt(sb.substring(0,7));
            sb.delete(0,7);
        }


       for(int tmp : bi){
//           int ten = 0;
//           int mul = 1;
//           while(tmp>0){
//               ten+=(tmp%10)*mul;
//               tmp = tmp/10;
//               mul = mul*2;
//           }
//           answer += (char)ten;
           answer+=(char)Integer.parseInt(String.valueOf(tmp),2);
       }

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String str = kb.nextLine();

        System.out.println(T.solution(n, str));
    }
}