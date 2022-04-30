package book_ndb.chapter03_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3_1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[] coins = {500,100,50,10};
        for(int coin : coins){
            count+=n/coin;
            n%=coin;
        }
        System.out.println(count);

    }
}
