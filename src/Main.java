import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        // 여기까지가 입력
        int T = Integer.parseInt(br.readLine());
        int[][] apt = new int[15][15];
        for (int i = 0; i < 15; ++i) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }
        for(int i=0;i<T;++i){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());


        }
        //여기부터가 출력
        bw.flush();
        bw.close();
    }

}