package book_ndb.chapter03_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =null;
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i =0;i<n;++i){
            int[] row = new int[m];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<m;++j){
                row[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(row);
            arr[i]=row[0];
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }
}
