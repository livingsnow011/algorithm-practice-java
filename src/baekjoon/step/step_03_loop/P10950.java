package baekjoon.step.step_03_loop;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P10950 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st=null;
        ArrayList<Integer> answer = new ArrayList<>();

        for ( int i =0;i<a;++i){
            st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            answer.add(b + c);
        }

        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for( Integer i : answer){
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
