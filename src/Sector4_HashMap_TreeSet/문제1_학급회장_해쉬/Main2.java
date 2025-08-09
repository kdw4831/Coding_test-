package Sector4_HashMap_TreeSet.문제1_학급회장_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public char solution (int n, String str){
        char answer = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map= new HashMap<>();

        for(char tmp : str.toCharArray()){
            map.put(tmp,map.getOrDefault(tmp,0)+1);
        }
//        System.out.println(map.containsKey('F'));  key가 존재하는가
//        System.out.println(map.size()); key value 쌍의 길이가 몇인가
//        System.out.println(map.remove('A')); key로 삭제를 한다.

        for(char tmp:map.keySet()){
            if(max<map.get(tmp)){
                max=map.get(tmp);
                answer=tmp;

            }
        }

        

        return answer;
    }
    public static void main(String[] args) {
        Main2 T =new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();



        System.out.println(T.solution(n,str));
    }
}