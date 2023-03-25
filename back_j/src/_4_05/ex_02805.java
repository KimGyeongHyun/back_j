package _4_05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_02805 {

    static long get_height_of_trees(int[] trees, int cut) {
        long sum = 0;
        for (int tree : trees) {
            if (tree > cut) sum += tree - cut;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] tree_array = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) tree_array[i] = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            if (end < tree_array[i]) end = tree_array[i];
        }

        int mid;
        long tree_sum;
        while (true) {
            mid = (int)(((long)start + (long)end)/2);

            if (start == mid) {
                if (get_height_of_trees(tree_array, mid+1) >= m) mid++;
                break;
            }

            tree_sum = get_height_of_trees(tree_array, mid);

            if (tree_sum >= m) start = mid;
            else end = mid;
        }

        bw.write(Integer.toString(mid));
        bw.flush();
        bw.close();
    }
}
