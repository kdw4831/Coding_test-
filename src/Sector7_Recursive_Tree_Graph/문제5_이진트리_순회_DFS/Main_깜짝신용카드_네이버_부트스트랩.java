package Sector7_Recursive_Tree_Graph.문제5_이진트리_순회_DFS;

import java.util.Scanner;

public class Main_깜짝신용카드_네이버_부트스트랩 {

    public String solution2(String s) {
        // if (!s.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")) return "INVALID";

        s = s.replace("-", "");
        int sum = 0;
        boolean doubleIt = false; // 오른쪽 끝(검증숫자)은 변환 X

        for (int i = s.length() - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            if (doubleIt) {
                d *= 2;
                if (d > 9) d -= 9; // = (d/10)+(d%10)
            }
            sum += d;
            doubleIt = !doubleIt;
        }

        System.out.println(sum); // 디버그용
        return (sum % 10 == 0) ? "VALID" : "INVALID";
    }


    public String solution(String str){
        String answer = "INVALID";
        str=str.replace("-","");
        char[] cStr = str.toCharArray();
        int[] arr = new int[str.length()];

        int cnt=0;
        int sum=0;
        for(int i=cStr.length-1;  i>=0; i--){
            arr[cnt++]=Integer.parseInt(Character.toString(cStr[i]));
        }

        for(int i=0; i< arr.length; i++){
            if(i%2==1){
                int tmp = arr[i]*2;
                arr[i]= tmp;
                if(tmp>9){
                    arr[i]= (tmp/10)+(tmp%10);
                }
            }
        }
        for(int tmp: arr) sum+=tmp;
        if(sum%10==0)answer="VALID";


        System.out.println(sum);
        if(sum%10==0)answer= "VALID";




        return answer;
    }

    public static void main(String[] args){
        Main_깜짝신용카드_네이버_부트스트랩 T= new Main_깜짝신용카드_네이버_부트스트랩();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));




    }
}




