import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int c;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){

            c = Integer.parseInt(st.nextToken());
            if ( X > c ){
                bw.write(c + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
