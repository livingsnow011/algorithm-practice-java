import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    static StringBuilder sb = new StringBuilder();
    //카드개수
    static int n;
    //카드에 적힌 숫자들 배열
    static Long[] cards;
    //현재 가장 많이 나온 카드 숫자
    static Long mode;
    //현재 연속된 카드 카운트, 가장 많이 연속된 카드 카운트
    static int curCnt,modeCnt;

    //Long 배열 한번만 흝는다, O(N)
    static void solution(Long[] cards){
        mode=cards[0];
        curCnt=1;
        modeCnt=1;
        if(cards.length>=1){
            for (int i = 1; i < cards.length; i++) {
                if(cards[i]==cards[i-1]){
                   //연속될 때
                    curCnt++;
                }else{
                    curCnt=1;
                }
                if(curCnt>modeCnt){
                    mode=cards[i];
                    modeCnt = curCnt;
                }
            }
        }

        sb.append(mode);
    }

    static void input(){
        FastReader scan = new FastReader();
        n = scan.nextInt();
        cards = new Long[n];
        
        for (int i = 0; i < n; i++) {
            cards[i] = scan.nextLong();
        }
    }
    public static void main(String[] args) {
        input();
        //역순정렬 O(NlogN)
        Arrays.sort(cards);
        solution(cards);
        System.out.println(sb.toString());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        Long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}