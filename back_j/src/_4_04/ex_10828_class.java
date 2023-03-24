package _4_04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_10828_class {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        Stack stack = new Stack();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            str = br.readLine();

            if (str.equals("pop")) bw.write(Integer.toString(stack.pop()) + "\n");
            else if (str.equals("size")) bw.write(Integer.toString(stack.size()) + "\n");
            else if (str.equals("empty")) bw.write(Integer.toString(stack.empty()) + "\n");
            else if (str.equals("top")) bw.write(Integer.toString(stack.top()) + "\n");

            else if (str.substring(0, 4).equals("push")) {
                stack.push(Integer.parseInt(str.substring(5)));
            }
        }
        bw.flush();
        bw.close();
    }
}

class Stack {
    private int[] a = new int[10000];
    private int idx = -1;

    public void push(int data) {this.a[++idx] = data;}
    
    public int pop() {
        if (this.idx == -1) return -1;
        else return a[idx--];
    }

    public int size() {return this.idx+1;};

    public int empty() {return (this.idx == -1) ? 1: 0;}

    public int top() {
        if (this.idx == -1) return -1;
        else return this.a[idx];
    }

}