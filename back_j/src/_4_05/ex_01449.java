package _4_05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ex_01449 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        Queue q = new Queue();
        q.init();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) q.push(Integer.parseInt(st.nextToken()));
        q.sort();

        int count = 0;
        int start, end;
        while (true) {

            if (q.empty() == 1) break;

            start = q.pop();
            count++;

            while (true) {
                if (q.empty() == 1) break;
                end = q.front();
                if (end - start >= l) break;
                q.pop();
            }

        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}

class Queue {
    private int[] a = new int[10000];
    private int idx = -1;

    public void init() {Arrays.fill(this.a, 1001);}

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

    public void sort() {Arrays.sort(this.a);}

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