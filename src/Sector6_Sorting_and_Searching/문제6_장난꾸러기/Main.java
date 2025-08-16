package Sector6_Sorting_and_Searching.문제6_장난꾸러기;


import java.util.*;


public class Main {
    public List<Integer> solution (int[] arr){
        List<Integer> answer = new ArrayList<>();
        // 기본자료형 배열은 clone으로 깊은 복사 가능 정확히는 그냥 복사된거
        // 참조자료형만 참조값을 복사하니까
        int[] arr2 = arr.clone();

//        int[] arr2 = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            arr2[i]=arr[i];
//        }
        Arrays.sort(arr2);

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=arr2[i])answer.add(i+1);
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
       for(int tmp : T.solution(arr)) System.out.print(tmp+" ");

    }
}