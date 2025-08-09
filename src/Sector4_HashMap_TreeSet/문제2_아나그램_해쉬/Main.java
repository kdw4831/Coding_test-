package Sector4_HashMap_TreeSet.문제2_아나그램_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution (String str1, String str2){
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char tmp :  str1.toCharArray()){
            map.put(tmp,map.getOrDefault(tmp,0)+1);
        }

        for(char x : str2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x,map.get(x)-1);
        }
//
//        for(char tmp : str2.toCharArray()){
//            if(map.containsKey(tmp))map.put(tmp,map.get(tmp)-1);
//        }
//
//        for(int tmp : map.values()){
//            if(tmp!=0){
//                answer="NO";
//                break;
//            }
//        }


        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();



        System.out.println(T.solution(str1,str2));
    }
}