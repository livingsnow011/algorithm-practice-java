package algorithm.graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


// BOJ 1260 DFS 와 BFS
// 인접 행렬로 표현
public class P0_MatrixSearch {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int vertex,edge,start;
    static int[][] matrix;
    static boolean[] DFSisVisited;
    static boolean[] BFSisVisited;

    static void input() {
        vertex= scan.nextInt();
        edge=scan.nextInt();
        start=scan.nextInt();
        matrix = new int[vertex + 1][vertex + 1];
        for (int i = 0; i < edge ; i++) {
            int vertex1 = scan.nextInt();
            int vertex2 = scan.nextInt();

            matrix[vertex1][vertex2] = 1;
            matrix[vertex2][vertex1] = 1;
        }
        DFSisVisited = new boolean[vertex+1];
        BFSisVisited = new boolean[vertex+1];
    }

    static void dfs(int start){
        DFSisVisited[start]=true;
        sb.append(start + " ");

        for (int i = 1; i <=vertex ; i++) {
            if(DFSisVisited[i])continue;
            if(matrix[start][i]==1)
                dfs(i);
        }
    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList();
        queue.add(start);
        BFSisVisited[start]= true;

        while (!queue.isEmpty()){
            int x= queue.poll();
            sb.append(x + " ");

            for (int i = 1; i <=vertex ; i++) {
                if(BFSisVisited[i])continue;

                if(matrix[x][i]==1){
                    queue.add(i);
                    BFSisVisited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        dfs(start);
        System.out.println(sb.toString());
        sb.setLength(0);
        bfs(start);
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
