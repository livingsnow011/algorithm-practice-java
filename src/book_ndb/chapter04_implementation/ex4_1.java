package book_ndb.chapter04_implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex4_1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] plans = new String[st.countTokens()];
        int idx=0;
        while(st.hasMoreTokens()){
            plans[idx] = st.nextToken();
            idx++;
        }

        String[] directions = {"L","R","U","D"};
        int[] dy ={-1,1,0,0};
        int[] dx = {0,0,-1,1};
        int x=1;
        int y=1;

        for(String plan : plans){
            for(int i=0;i<directions.length;++i){
                if(directions[i].equals(plan)){
                    if(x+dx[i]>0&&x+dx[i]<=n&&y+dy[i]>0&&y+dy[i]<=n){
                        x+=dx[i];
                        y+=dy[i];
                    }
                }
            }
        }
        System.out.println(x+" "+y);
    }
}
