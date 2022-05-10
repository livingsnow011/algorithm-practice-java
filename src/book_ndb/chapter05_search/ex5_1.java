package book_ndb.chapter05_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex5_1 {
    static int count=0;

    static void dfs(int[][] graph,int n,int m){

    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] graph = new int[n][m];

        for(int i=0;i<n;++i){
            String row = br.readLine();
            for(int j=0;j<m;++j){
                graph[i][j] = (int)row.charAt(j) - 48;
            }
        }

        dfs(graph,n,m);

    }
}
