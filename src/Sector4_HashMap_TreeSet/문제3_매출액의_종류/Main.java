package Sector4_HashMap_TreeSet.문제3_매출액의_종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution (int n, int k, int[] arr ){
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map  = new HashMap<>();

        for(int i=0; i<k; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        answer.add(map.size());

        for(int i=0; i<n-k; i++){
            map.put(arr[i+k],map.getOrDefault(arr[i+k],0)+1);
            if(map.get(arr[i])>1){
                map.put(arr[i],map.get(arr[i])-1);
            }else map.remove(arr[i]);

            answer.add(map.size());

        }


        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }



        for(int tmp:T.solution(n,k,arr)){
            System.out.print(tmp+" ");
        }
    }
}