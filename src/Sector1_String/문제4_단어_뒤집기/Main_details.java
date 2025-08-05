package Sector1_String.문제4_단어_뒤집기;


import java.util.*;

public class Main_details {
    public ArrayList<String> solution (int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for( String tmp : str){
            int lt =0, rt =tmp.length()-1;
            char[] arr = tmp.toCharArray();
            while(lt<rt){
                char value  = arr[lt];

                arr[lt]= arr[rt];
                arr[rt] =value;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(arr));
        }

        return answer;
    }
    public static void main(String[] args) {
        Main_details T = new Main_details();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = kb.next();
        }

        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}