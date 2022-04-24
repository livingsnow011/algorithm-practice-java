package baekjoon.step.step_04_array;
import java.io.*;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();
        int result =A*B*C;

        while(result!=0){
            numbers[result%10]++;
            result/=10;
        }

        for(int i=0; i<numbers.length;++i){
            bw.write(String.valueOf(numbers[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
