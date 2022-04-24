package baekjoon.step.step_04_array;
import java.io.*;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] array = new String[N];

        for(int i=0;i<N;++i){
            array[i]= br.readLine();
        }

        for(int i=0;i<N;++i){
            int sum = 0;
            int cnt = 0;
            for(int j=0;j<array[i].length();++j){
                if(array[i].charAt(j)=='O')
                    cnt++;
                else
                    cnt=0;

                sum+=cnt;
            }
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
