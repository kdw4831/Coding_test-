package Sector1_String.문제4_단어_뒤집기;


import java.util.*;

public class Main_StringBuilder {
    public ArrayList<String> solution (int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String tmp : str){
            String result = new StringBuilder(tmp).reverse().toString();
            answer.add(result);

        }

        return answer;
    }
    public static void main(String[] args) {
        Main_StringBuilder T = new Main_StringBuilder();
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