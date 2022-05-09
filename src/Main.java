import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        // 여기까지가 입력
        int n = Integer.parseInt(br.readLine());
        int oldN = n;
        int count = 0;
        ArrayList<Integer> answers = new ArrayList<Integer>();

        while(true){
            if(n%3==0){
                int newCount = count+n/3;
                answers.add(newCount);
            }

            n-=5;
            count++;
            if(n==0) {
                answers.add(count);
                break;
            }
            else if(n<0) {
                answers.add(-1);
                break;
            };
        }
        Integer answer=0;
        Collections.sort(answers);
        for(int i : answers){
            System.out.println(i);
        }
        if(answers.size()>1){
            answer = answers.get(1);
        }else
            answer = answers.get(0);
        if(oldN==0)answer=-1;
        System.out.println(answer);
    }
}