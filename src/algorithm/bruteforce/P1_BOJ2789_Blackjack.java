package algorithm.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class P1_BOJ2789_Blackjack {
    static StringBuilder sb = new StringBuilder();

    static int max = Integer.MIN_VALUE;

    // n 카드의 갯수, m 블랙잭 넘버
    static int n,m;
    // 카드의 값, 사용여부
    static int[] cards,selected;
    //선택된 카드들;
    static  int[] hand = new int[4];
    //합
    static int sum=0;

    // N 개 중 중복을 허용하지 않고, M 개를 고르기
    // 2-B 유형
    static void rec_func(int k){
        if(k==4){
            for (int i = 1; i < 4; i++) {
                sum += hand[i];
            }
            if(sum<=m){
                max = Math.max(sum, max);
            }
            sum = 0;
        }
        // 중복을 허용하지 않고, 고르기
        else{
            for (int i = selected[k-1]+1; i <= n; i++) {
                selected[k]=i;  hand[k]=cards[i];
                rec_func(k+1);
                selected[k]=0;   hand[k]=0;
            }

        }
    }


    static void input(){
        FastReader scan = new FastReader();
        n = scan.nextInt();
        m = scan.nextInt();
        cards = new int[n+1];
        for (int i = 1; i <= n; i++) {
            cards[i] = scan.nextInt();
        }
        selected = new int[n+1];
    }
    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(max);
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

        Long nextLong() {
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