package baekjoon.step.step_03_loop;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N<10){
            N*=10;
        }
        br.close();
        int answer=N;
        int cycle = 0;
        while(true){
            cycle++;
            N = ((N%10)*10)+((N/10+N%10)%10);
            if (N == answer) {
                break;
            }
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(cycle));
        bw.flush();
        bw.close();
    }
}
