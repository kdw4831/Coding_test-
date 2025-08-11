package Sector5_Stack_Queue.문제3_크레인_인형뽑기_카카오;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution (int n, int m, int[][] board, int[] moves ){
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int tmp = board[j][moves[i]-1];
                if(tmp!=0){
                    if(!bucket.isEmpty()&&bucket.peek()==tmp){
                        bucket.pop();
                        answer+=2;
                    }
                    else bucket.push(tmp);
                    board[j][moves[i]-1]=0;
                    break;
                }
            }

        }


        

        return answer;
    }
    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m= kb.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] =kb.nextInt();
        }

        System.out.println(T.solution(n,m,board,moves));
    }
}