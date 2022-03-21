package book_ndb.chapter03_greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        Integer[] arr = new Integer[n];

        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0 ;
        int j = 0;
        int idx = 0;

        for(int i=0;i<m;++i){
            sum += arr[idx];
            j++;
            if(j>=k){
                j=0;
                idx = 1;
            }else
                idx=0;
        }

        System.out.println(sum);

        /**
         Arrays.sort(arr, 0, n);

         int sum = 0;
         sum += ((arr[n - 1] * k) + arr[n - 2]) * (m / (k + 1)) + (arr[n - 1] * (m % (k + 1)));
         * */

    }
}
