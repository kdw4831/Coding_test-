package Sector6_Sorting_and_Searching.문제7_좌표정렬;


import java.util.*;


public class Main {
    class Point implements Comparable<Point>{
        public int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o){
            if(this.x == o.x) return this.y -o.y;
            else return this.x-o.x;
        }
    }



    public ArrayList<Point> solution (int[][] arr){
        ArrayList<Point> answer=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            answer.add(new Point(arr[i][0],arr[i][1]));
        }

        Collections.sort(answer);



        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=kb.nextInt();
            }

        }

        for(Point tmp :T.solution(arr)){
            System.out.print(tmp.x+" "+tmp.y);
            System.out.println();
        }


    }
}