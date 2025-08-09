package Sector4_HashMap_TreeSet.문제4_모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution (String s, String t){
        int answer=0;
        HashMap<Character,Integer> map = new HashMap<>();

        char[] s_arr=s.toCharArray();
        for(int i=0; i<t.length()-1; i++){
            map.put(s_arr[i],map.getOrDefault(s_arr[i],0)+1);
        }
        int lt=0;
        for(int rt=t.length()-1; rt<s.length(); rt++){
            boolean flag = true;
            map.put(s_arr[rt],map.getOrDefault(s_arr[rt],0)+1);
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(char x : map.keySet()){
                map2.put(x,map.get(x));
            }
            for(char tmp : t.toCharArray()){

                if(!map2.containsKey(tmp) || map2.get(tmp)==0){
                    flag=false;
                    break;
                }
                map2.put(tmp,map2.get(tmp)-1);

            }
            if(flag)answer++;
            map.put(s_arr[lt],map.get(s_arr[lt])-1);
            if(map.get(s_arr[lt])==0)map.remove(s_arr[lt]);
            lt++;

        }



        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();



        System.out.println(T.solution(str1,str2));
    }
}