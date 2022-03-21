package book_ndb.chapter03_greedy;

import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        int N,count =0;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();

        int[] coins = {500, 100, 50, 10};

        for(int coin:coins){
            count += N / coin;
            N %= coin;
        }

        System.out.println(count);
    }
}
