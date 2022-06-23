import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int n,m;
    static int[] arr,used;
    static ArrayList<Integer> sequence = new ArrayList<>();

    //N개 중에서 중복을 허용하여, 순서대로 나열하는 문제
    static void rec(int k){
        if(k==m+1){
        }
        else{
            for (int i = 1; i <=n ; i++) {
//                used[k]=i;
//                rec(k+1);
//                used[k]=0;
            }
        }
    }

    static void input() {
        n= scan.nextInt();
        m= scan.nextInt();
        arr = new int[n+1];
        used = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            arr[i]= scan.nextInt();
        }
    }

    public static void main(String[] args) {
        input();
        rec(1);
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