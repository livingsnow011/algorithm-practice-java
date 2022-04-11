package baekjoon.step.step_02_conditional;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2480 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] dice = {a, b, c};

        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ans = 0;
        if (dice[0] == dice[1] && dice[1] == dice[2]){
            ans = (1000+dice[0]*1000);
            bw.write(String.valueOf(ans));
        } else if (dice[0] == dice[1]){
            ans = 1000+dice[0]*100;
            bw.write(String.valueOf(ans));
        } else if (dice[1]==dice[2]){
            ans = 1000+dice[1]*100;
            bw.write(String.valueOf(ans));
        } else if (dice[0]==dice[2]){
            ans = 1000+dice[2]*100;
            bw.write(String.valueOf(ans));
        } else{
            Arrays.sort(dice);
            ans = 100*dice[2];
            bw.write(String.valueOf(ans));
        }

        bw.flush();
        bw.close();
    }
}
