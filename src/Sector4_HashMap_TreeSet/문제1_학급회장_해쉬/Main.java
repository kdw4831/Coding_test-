package Sector4_HashMap_TreeSet.문제1_학급회장_해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution (int n, String str){
        char answer = 0;
        Integer max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        map.put('A',0);
        map.put('B',0);
        map.put('C',0);
        map.put('D',0);
        map.put('E',0);

        for(int i=0; i<n; i++){
            map.put(arr[i],map.get(arr[i])+1);
        }

        for(int tmp : map.values()){
            if(tmp>max)max=tmp;
        }

        for(Character tmp : map.keySet()){
            if(map.get(tmp).equals(max)){
                answer=tmp;
            }


        }
        

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        String str = kb.nextLine();



        System.out.println(T.solution(n,str));
    }
}