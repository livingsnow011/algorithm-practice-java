package baekjoon.step.step_03_loop;
import java.io.*;

public class P10951 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str ;

        while(true){
            if((str=br.readLine())==null){
                break;
            }
            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            bw.write(String.valueOf(a+b));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
