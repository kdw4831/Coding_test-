package Sector6_Sorting_and_Searching.문제5_중복확인;


import java.util.*;


public class Main {
    public String solution (int[] arr){
        String answer="U";
//        HashSet<Integer> hs= new HashSet<>();
//        for(int x : arr){
//            hs.add(x);
//        }
//        if(hs.size()!=arr.length)return "D";

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)>1)return "D";
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);



        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(arr));

    }
}