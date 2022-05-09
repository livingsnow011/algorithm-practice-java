package book_ndb.chapter04_implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();
        int x = ((int) command.charAt(0))-96;
        int y = ((int)command.charAt(1))-48;

        int count = 0;
        int[][] direction={{-1,2},{1,2},{2,1},{2,-1},{-1,-2},{1,-2},{-2,1},{-2,-1}};
        for(int i=0;i<8;++i){
            if(x+direction[i][0]<=0||x+direction[i][0]>8||y+direction[i][1]<=0||y+direction[i][1]>8)
                continue;
            count++;
        }

        System.out.println(count);
    }
}
