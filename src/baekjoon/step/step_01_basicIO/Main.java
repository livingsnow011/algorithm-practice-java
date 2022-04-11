package baekjoon.step.step_01_basicIO;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.print((a*(b%10))+"\n"+
                (a*(b%100/10))+"\n"+
                (a*(b/100))+"\n"+(a*b));
    }
}
