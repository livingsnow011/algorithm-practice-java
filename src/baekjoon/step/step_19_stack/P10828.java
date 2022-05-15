package baekjoon.step.step_19_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10828 {
    static int[] stack;
    static int stackPointer =0;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = null;

        int n = Integer.parseInt(br.readLine());
        stack = new int[n];
        for(int i=0;i<n;++i){
            st = new StringTokenizer(br.readLine(), " ");
            if(st.countTokens()>1){
                st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                push(x);
            }else{
                String command = st.nextToken();
                switch (command){
                    case "top":
                        System.out.println(top());
                        break;
                    case "size":
                        System.out.println(size());
                        break;
                    case "pop":
                        System.out.println(pop());
                        break;
                    case "empty":
                        System.out.println(empty());
                        break;
                    default:
                        break;
                }
            }
        }
    }

    static void push(int x){
        stack[stackPointer] = x;
        stackPointer++;
    }

    static int pop(){
        if(stackPointer<=0){
            return -1;
        }else{
            int popNumber = stack[stackPointer-1];
            stack[stackPointer-1] = 0;
            stackPointer--;
            return popNumber;
        }
    }

    static int size(){
        return stackPointer;
    }

    static int empty(){
        return stackPointer==0?1:0;
    }

    static int top(){
        if(stackPointer<=0){
            return -1;
        }else{
            return stack[stackPointer-1];
        }
    }
}
