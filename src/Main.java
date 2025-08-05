import java.util.*;

public class Main {
    public ArrayList<Integer> solution (int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();


        return answer;
    }
    public static void main(String[] args) {
        Sector2_Array.문제1_큰_수_출력하기.Main T =new Sector2_Array.문제1_큰_수_출력하기.Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,arr));
    }
}