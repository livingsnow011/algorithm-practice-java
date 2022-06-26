import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int n;
    static int m;
    static int[][] map;
    static int selected[];
    static int[][] selectedPoint;
    static int zeroCnt = 0;
    static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    static boolean[][] visit;

    static int[][] newMap;
    static int max = Integer.MIN_VALUE;

    static void input(){
        n= scan.nextInt();
        m = scan.nextInt();
        map = new int[n + 1][m + 1];

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                map[i][j] = scan.nextInt();
                if(map[i][j]==0)
                    zeroCnt++;
            }
        }

        selected = new int[zeroCnt + 1];
        selectedPoint = new int[zeroCnt + 1][2];

        int idx =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if(map[i][j]==0){
                   selectedPoint[idx][0]=i;
                   selectedPoint[idx][1]=j;
                   idx++;
                }
            }
        }
    }

    // 0인 점 n개 중에서 3개를 선택
    static void rec(int k){
        //0인 구역에 울타리 3개를 설치했을 경우
        if(k==4){
            visit = new boolean[n + 1][m + 1];
            newMap = new int[n + 1][m + 1];

            for (int i = 1; i <n+1 ; i++) {
                for (int j = 1; j <m+1 ; j++) {
                    newMap[i][j] = map[i][j];
                }
            }

            for (int i = 1; i <n+1 ; i++) {
                for (int j = 1; j <m+1 ; j++) {
                    if(!visit[i][j]&&newMap[i][j]==2)
                        dfs(i,j);
                }
            }
            int cnt=0;
            for (int i = 1; i <n+1 ; i++) {
                for (int j = 1; j <m+1 ; j++) {
                    if(newMap[i][j]==0)
                        cnt++;
                }
            }
                max = Math.max(cnt, max);
        }
        else{
            for (int i = selected[k-1]+1; i <=zeroCnt ; i++) {
                selected[k]=i;
                map[selectedPoint[selected[k]][0]][selectedPoint[selected[k]][1]]=1;
                rec(k+1);
                map[selectedPoint[selected[k]][0]][selectedPoint[selected[k]][1]]=0;
                selected[k]=0;
            }
        }
    }

    static void dfs(int row, int col){
        visit[row][col] = true;
        if(newMap[row][col]==0)
            newMap[row][col]=2;

        for (int i = 0; i < dir.length ; i++) {
            int newRow = row + dir[i][0];
            int newCol = col + dir[i][1];

            if(newRow<1||newCol<1||newRow>n||newCol>m)continue;
            if(!visit[newRow][newCol]&&newMap[newRow][newCol]!=1){
                dfs(newRow,newCol);
            }
        }

    }

    public static void main(String[] args) {
        input();
        rec(1);

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