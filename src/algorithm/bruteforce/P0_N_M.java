package algorithm.bruteforce;
import java.io.*;
import java.util.StringTokenizer;

// BOJ 15649 ~ 15652 N과 M (3) (1) (4) (2)
// 1 : N끼리의 중복을 허용함, 2 : N끼리의 중복을 허용하지 않음
// A : 순서대로 나열하기, B : 고르기
// 재귀로 생각
public class P0_N_M {
    static StringBuilder sb = new StringBuilder();

    static int N,M;
    static int[] selected;
    //중복을 허용하지 않을 때
    static int[] used;

    static void input(){
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected= new int[N+1];
        used = new int[N+1];
    }

    //BOJ 15651 N과 M (3)
    //1-A : 중복을 허용하여 순서대로 나열하기
    static void rec_func1(int k) {
        if(k==M+1){
            for (int i = 1; i <M+1 ; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else{
            for (int i = 1; i <= N; i++) {
                selected[k]=i;
                rec_func1(k+1);
                selected[k]=0;
            }
        }
    }

    //BOJ 15649 N과 M (1)
    //2-A : 중복을 허용하지 않고, 순서대로 나열하기
    static void rec_func2(int k){
        if(k==M+1){
            for (int i = 1; i < M+1; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }else{
            for(int i=1;i<=N;++i){
                if(used[i]==1) continue;

                selected[k]=i;     used[i]=1;
                rec_func2(k+1);
                selected[k]=0;      used[i]=0;
            }
        }
    }

    //BOJ 15649 N과 M (4)
    //2-A : 중복을 허용하여, 고르기
    // 1 2 == 2 1 같은 것으로 취급
    static void rec_func3(int k){
        if(k==M+1){
            for (int i = 1; i < M+1 ; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else{
            int start = selected[k-1];
            if(start == 0 ) start = 1;

            for (int i = start; i <= N; i++) {
                selected[k]=i;
                rec_func3(k+1);
                selected[k]=0;
            }
        }
    }

    //BOJ 15650 N과 M (2)
    //2-A : 중복을 허용하지 않고, 고르기
    static void rec_func4(int k){
        if(k==M+1){
            for (int i = 1; i < M+1; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }else{
            int start = selected[k-1];
            if(start==0) start=1;
            for (int i = start; i <= N ; i++) {
                if(used[i]==1) continue;
                selected[k]=i;  used[i]=1;
                rec_func4(k+1);
                selected[k]=0; used[i]=0;
            }
        }
    }

    public static void main(String[] args) {
        input();

//        System.out.println("BOJ 15651번 N과 M 3번\nN개의 수를 중복을 허용하여, M개씩 나열하기");
//        rec_func1(1);   System.out.println(sb.toString());  sb.setLength(0);
//
//        System.out.println("BOJ 15649번 N과 M 1번\nN개의 수를 중복을 허용하지 않고, M개씩 나열하기");
//        rec_func2(1);   System.out.println(sb.toString());  sb.setLength(0);
//
//        System.out.println("BOJ 15652번 N과 M 4번\nN개의 수를 중복을 허용하여, 고르기");
//        rec_func3(1);   System.out.println(sb.toString());  sb.setLength(0);

        System.out.println("BOJ 15650번 N과 M 2번\nN개의 수를 중복을 허용하지 않고, 고르기");
        rec_func4(1);   System.out.println(sb.toString());  sb.setLength(0);
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