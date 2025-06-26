import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[20000001]; // -10,000,000 ~ 10,000,000

    
        String[] cards = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(cards[i]);
            arr[num + 10000000]++;
        }

        int M = Integer.parseInt(br.readLine());
        String[] queries = br.readLine().split(" ");


        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(queries[i]);
            bw.write(arr[x + 10000000] + " ");
        }

        bw.flush(); 
    }
}
