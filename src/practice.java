import java.io.*;

public class practice{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("dmd");
        bw.flush();
        bw.close();
    }
}