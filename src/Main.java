import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int arr[];



    static void input(){
        FastReader scan = new FastReader();
        n = scan.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
    }

    public static void main(String[] args) {
        input();

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
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