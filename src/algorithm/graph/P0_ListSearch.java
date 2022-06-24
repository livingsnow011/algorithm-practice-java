package algorithm.graph;

import java.io.*;
import java.util.*;

// BOJ 1260 DFS 와 BFS
// 인접 리스트로 표현
public class P0_ListSearch {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int vertex, edge, start;
    // 리스트의 리스트도 가능하지만, 리스트의 배열이 더 편한듯.
    // 리스트 배열의 인덱스마다 할당하는 것을 잊지말자.
    static ArrayList<Integer>[] list;
    static boolean[] DFSisVisited;
    static boolean[] BFSisVisited;

    static void input() {
        vertex = scan.nextInt();

        edge = scan.nextInt();
        start = scan.nextInt();

        //어레이리스트 배열 선언 주의
        list = new ArrayList[vertex+1];
        for (int i = 1; i <=vertex ; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            int vertex1 = scan.nextInt();
            int vertex2 = scan.nextInt();

            list[vertex1].add(vertex2);
            list[vertex2].add(vertex1);
        }

        // 문제에서 요구
        for (int i = 1; i <=vertex ; i++) {
            Collections.sort(list[i]);
        }

        DFSisVisited = new boolean[vertex + 1];
        BFSisVisited = new boolean[vertex + 1];
    }

    static void dfs(int start){
        DFSisVisited[start]=true;
        sb.append(start + " ");

        for(Integer linkedVertex : list[start]){
            if(DFSisVisited[linkedVertex]) continue;
            dfs(linkedVertex);
        }
    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList();
        queue.add(start);
        BFSisVisited[start]= true;

        while (!queue.isEmpty()){
            int x= queue.poll();
            sb.append(x + " ");

            for (Integer linkedVertex : list[x]) {
                if(BFSisVisited[linkedVertex])continue;
                queue.add(linkedVertex);
                BFSisVisited[linkedVertex]=true;
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
