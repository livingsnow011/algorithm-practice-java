package baekjoon.step.step_05_function;
import java.io.*;
import java.util.Arrays;
public class P4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] check= new boolean[10001];
        for (int i=0; i<10001;++i){
            int n = d(i);
            if(n<10001)
                check[n]=true;
        }

        for(int i=0;i<10001;++i){
            if(check[i]==false){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static int d(int n){
        int sum = n;

        while(n!=0){
            sum+=(n%10);
            n/=10;
        }

        return sum;
    }
}
