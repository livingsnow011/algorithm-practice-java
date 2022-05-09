package book_ndb.chapter04_implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4_3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] map = new boolean[n][m];

        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());
        int[] dx ={-1,0,1,0};
        int[] dy ={0,1,0,-1};

        for(int i=0;i<n;++i){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<m;++j){
                map[i][j] = (Integer.parseInt(st.nextToken())!=0);
            }
        }

        int count =1;
        int stopcount=0;
        while (true){
            int nx;
            int ny;
            if(direction==0){
                direction=3;
                nx=x+dx[direction];
                ny=y+dy[direction];
            }else{
                direction--;
                nx=x+dx[direction];
                ny=y+dy[direction];
            }

            if(!map[nx][ny]){
                map[x][y]=true;
                x=nx;
                y=ny;
                stopcount=0;
                count++;
                continue;
            }else{
                stopcount++;
            }
            if(stopcount==3) break;
        }

        System.out.println(count);
    }
}
