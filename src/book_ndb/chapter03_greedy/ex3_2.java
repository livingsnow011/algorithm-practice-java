package book_ndb.chapter03_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ex3_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =null;
        st = new StringTokenizer(br.readLine(), " ");

        int sum=0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer arr[] = new Integer[n];
        st= new StringTokenizer(br.readLine()," ");
        for(int i=0;i<arr.length;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int count = 1;
        for(int i=0;i<m;++i){
            if(count==k){
                count=1;
                sum += arr[1];
                continue;
            }
            count++;
            sum+=arr[0];
        }
        System.out.println(sum);
    }
}
