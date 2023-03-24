package _4_04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_10845 {

    static int[] a = new int[10000];
    static int index = -1;

    static void push(int data) {a[++index] = data;}

    static int pop() {
        if (index == -1) return -1;
        else {
            int return_int = a[0];
            for (int i = 0; i < index; i++) a[i] = a[i+1];
            index--;
            return return_int;
        }
    }

    static int size() {return index+1;}

    static int empty() {return (index == -1) ? 1 : 0;}

    static int front() {
        if (index == -1) return -1;
        else return a[0];
    }

    static int back() {
        if (index == -1) return -1;
        else return a[index];
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            str = br.readLine();

            if (str.equals("pop")) bw.write(Integer.toString(pop()) + "\n");
            else if (str.equals("size")) bw.write(Integer.toString(size()) + "\n");
            else if (str.equals("empty")) bw.write(Integer.toString(empty()) + "\n");
            else if (str.equals("front")) bw.write(Integer.toString(front()) + "\n");
            else if (str.equals("back")) bw.write(Integer.toString(back()) + "\n");


            else if (str.substring(0, 4).equals("push")) {
                push(Integer.parseInt(str.substring(5)));
            }

        }

        bw.flush();
        bw.close();
    }
}
