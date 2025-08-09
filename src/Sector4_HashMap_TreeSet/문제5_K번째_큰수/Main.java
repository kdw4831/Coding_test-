package Sector4_HashMap_TreeSet.문제5_K번째_큰수;

import java.util.*;

public class Main {
    public int solution (int n , int k, int[] arr){
        int answer=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int tmp : arr){
            list.add(tmp);
        }

        list.sort((o2,o1)->o2-o1);
        while(list.size()>1){
            sum=list.get(0)+list.get(1);
            list.remove(0);
            int lt=0;
            for(int rt=1; rt<list.size(); rt++){
                sum+=list.get(rt);
                map.put(sum,map.getOrDefault(sum,0)+1);
                sum-=list.get(lt++);

            }
        }

        list.clear();
        list.addAll(map.keySet());
        list.sort((o1,o2)->o2-o1);

        if(k-1>list.size())return -1;
        answer=list.get(k-1);





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



        System.out.println(T.solution(n,k,arr));
    }
}