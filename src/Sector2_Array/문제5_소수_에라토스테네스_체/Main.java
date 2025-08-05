package Sector2_Array.문제5_소수_에라토스테네스_체;


import java.util.Scanner;

public class Main {
    public int solution (int n){
        int answer = 2; // 2 와 3을 미리 초기화
        boolean isPrime=true;
        //소수는 약수가 1과 자기자신이여야한다.
        //반을 나눠서 => 몫을 구하고
        //2부터 몫까지 배열을 돌린다 나머지가 없는 경우에만 count++ 후 리턴
        /*
            6 1236
            9 139

        */



        for(int i=4; i <=n ; i++){
            for(int j=2; j<= Math.sqrt(i); j++){
                if(i%j == 0){
                    isPrime= false;
                    break;
                }else {
                    isPrime= true;
                }
            }
            if(isPrime) answer++;
        }


        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}