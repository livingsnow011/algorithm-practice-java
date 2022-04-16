package baekjoon.step.step_04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static String solution(int a, int b) {
        //2016년 1월 1일은 금요일
        //윤년이므로 2월 29일 있음
        //a = i-1;
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] answers = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
//        1/1일이 금요일이면 1월 8일이 금요일
        int substract =0;

        //2월 2일
        for(int i=0;i<a;++i){
            if(i==(a-1)){
                substract += b-1;
                break;
            }
            substract+=day[i];
        }
        String answer=answers[substract%7];
        return answer;
    }

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(solution(a,b));
    }
}