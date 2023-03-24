package _4_04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_10845_class {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        Queue queue = new Queue();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            str = br.readLine();

            if (str.equals("pop")) bw.write(Integer.toString(queue.pop()) + "\n");
            else if (str.equals("size")) bw.write(Integer.toString(queue.size()) + "\n");
            else if (str.equals("empty")) bw.write(Integer.toString(queue.empty()) + "\n");
            else if (str.equals("front")) bw.write(Integer.toString(queue.front()) + "\n");
            else if (str.equals("back")) bw.write(Integer.toString(queue.back()) + "\n");

            else if (str.substring(0, 4).equals("push")) {
                queue.push(Integer.parseInt(str.substring(5)));
            }
        }
        bw.flush();
        bw.close();
    }
}

class Queue {
    private int[] a = new int[10000];
    private int idx = -1;

    public void push(int data) {this.a[++idx] = data;}
    
    public int pop() {
        if (this.idx == -1) return -1;
        else {
            int return_int = a[0];
            for (int i = 0; i < idx; i++) this.a[i] = a[i+1];
            this.idx--;
            return return_int;
        }
    }

    public int size() {return this.idx+1;};

    public int empty() {return (this.idx == -1) ? 1: 0;}

    public int front() {
        if (this.idx == -1) return -1;
        else return this.a[0];
    }

    public int back() {
        if (this.idx == -1) return -1;
        else return this.a[idx];
    }

}