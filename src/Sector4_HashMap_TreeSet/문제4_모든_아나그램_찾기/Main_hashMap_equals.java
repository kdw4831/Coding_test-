package Sector4_HashMap_TreeSet.문제4_모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main_hashMap_equals {
    public int solution (String s, String t){
        int answer=0;
        HashMap<Character,Integer> s_map = new HashMap<>();
        HashMap<Character,Integer> t_map = new HashMap<>();
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        for(int i=0; i<t.length()-1; i++){
            s_map.put(s_arr[i],s_map.getOrDefault(s_arr[i],0)+1);
        }
        for(int i=0; i<t.length(); i++){
            t_map.put(t_arr[i],t_map.getOrDefault(t_arr[i],0)+1);
        }
        int lt=0;
        for(int rt=t.length()-1; rt<s.length(); rt++){
            s_map.put(s_arr[rt],s_map.getOrDefault(s_arr[rt],0)+1);
            if(t_map.equals(s_map))answer++;
            s_map.put(s_arr[lt],s_map.get(s_arr[lt])-1);

            if(s_map.get(s_arr[lt])==0)s_map.remove(s_arr[lt]);
            lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main_hashMap_equals T =new Main_hashMap_equals();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();



        System.out.println(T.solution(str1,str2));
    }
}