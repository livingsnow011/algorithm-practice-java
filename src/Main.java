import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int n, m;
    static ArrayList<Integer>[] graph;
    static boolean[] isUsed;
    static int[] indegree;

    static ArrayList<Integer> list = new ArrayList<>();

    public static void input(){
        n = scan.nextInt();
        m = scan.nextInt();

        graph = new ArrayList[n + 1];
        indegree = new int[n + 1];
        isUsed = new boolean[n + 1];
        for (int i = 1; i < n+1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a].add(b);
            indegree[b]++;
        }
    }

    public static void sol(){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <n+1 ; i++) {
            if(indegree[i]==0){
                isUsed[i] = true;
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int x = queue.poll();
            list.add(x);
            for (int i = 0; i < graph[x].size(); i++) {
                indegree[graph[x].get(i)]--;
            }

            for (int i = 1; i <n+1 ; i++) {
                if(indegree[i]==0&&!isUsed[i]){
                    isUsed[i] = true;
                    queue.add(i);
                }
            }

        }


    }

    public static void main(String[] args) {
        input();
        sol();
        System.out.println(list);
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
