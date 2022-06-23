package algorithm.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

//가장 대표적인 백트래킹 문제
//1-A인지 2-A인지 햇갈릴 수 있다. 중복을 허용하지만 탐색에서 막아야하므로 1-A 유형
public class P3_BOJ9663_N_Queen {
    static StringBuilder sb = new StringBuilder();
    static FastReader scan = new FastReader();
    static int n;
    static int[] cols;
    static int count=0;

    //N개 중에 중복을 허용하면서, 순서가 있는 유형 1-A
    //N은 열의 번호, k는 행의 번호, 13245 는 31245와 다르다.
    //탐색 중에 조건을 넣어야한다.
    static void rec(int row){
        if(row==n+1){
            count++;
        }
        else{
            boolean pass=true;
            for (int i = 1; i <= n ; i++) {
                for (int prevRow = 1; prevRow < row ; prevRow++) {
                    //i는 cols[row]
                    //메서드 파라미터를 직관적으로 설계해야함
                    //check(현재 행, 현재 행의 열,과거 행, 과거 행의 열)
                    pass = check(row,i,prevRow,cols[prevRow]);
                    if(!pass)
                        break;
                }
                if(pass){
                    cols[row]=i;
                    rec(row+1);
                    cols[row]=0;
                }
            }
        }
    }

    static boolean check(int r1, int c1,int r2,int c2){
       if(c1==c2) return false;
       //대각선 조건이 기억이 안 날 수도 있다. 체스판을 그려보면 됨.
       if(r1+c1==r2+c2) return false;
       if(Math.abs(r1-r2)==Math.abs(c1-c2)) return false;
       return true;
    }

    static void input() {
        n = scan.nextInt();
        cols = new int [n+1];
    }

    public static void main(String[] args) {
        input();
        rec(1);
        System.out.println(count);
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
