package algorithm.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

//탐색이 끝나고 연산을 하는 것보다, 탐색 중 파라미터로 전달하는게 더 빠를듯
public class P2_BOJ14888_Operators {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int[] nums;
    static int[] signs = new int[5];
    static int[] orders;

    static int min=Integer.MAX_VALUE;   static int max=Integer.MIN_VALUE;

    //k는 연산자를 넣는 횟수
    //n 개를 중복을 허용하지 않고, 순서가 있는 2-A 타입
    //복잡도 O(N!/(N-M)!)
    static void rec(int k){
        //연산자를 n-1 개 배치했을 때 탐색이 한번 끝난다.
        if(k==n){
            int result = calc();
            max = Math.max(result, max);
            min = Math.min(result,min);
        }
        //그 외
        else{
            for (int i = 1; i < 5; i++) {
                if(signs[i]==0) continue;
                orders[k]=i;    signs[i]--;
                rec(k+1);
                orders[k]=0;    signs[i]++;
            }
        }
    }

    static int calc(){
        int result=nums[1];
        for (int i = 1; i < orders.length ; i++) {
            switch (orders[i]){
                case 1:
                    result+=nums[i+1];
                    break;
                case 2:
                    result-=nums[i+1];
                    break;
                case 3:
                    result*=nums[i+1];
                    break;
                case 4:
                    result/=nums[i+1];
                    break;
            }
        }
        return  result;
    }

    static void input(){
        FastReader scan = new FastReader();
        n = scan.nextInt();
        nums = new int[n + 1];
        orders = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 1; i < 5; i++) {
            signs[i]= scan.nextInt();
        }
    }

    public static void main(String[] args) {
        input();
        rec(1);
        sb.append(max).append("\n").append(min);
        System.out.println(sb.toString());
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