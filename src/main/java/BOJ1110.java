import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int New = 0;
        int first, two;
        int New_first, New_two;
        int d = n;
        int cnt = 0;
        int q = 0;
        while(!(n == New)){
            if(cnt == 0) {
                if (d < 10) {
                    // 55 -> 5 + 5 = 10  50
                    // 6 -> 60 -> 6+0 = 6 66
                    // 60 -> 6 + 0 = 6 66
                    q = d;
                    d = d * 10;
                }
                first = d % 10; // 5
                two = d / 10; // 5
                New_first = first * 10; // 50
                if ((first + two) >= 10) {
                    New_two = (first + two) % 10; // 0
                } else {
                    New_two = first + two;
                }
                New = New_first + New_two + (q*10); // 50
                System.out.println(New);
                q = 0;
                cnt++;
            }
            else{
                if (New < 10) {
                    // 1 -> 10 -> 1 + 0 = 1 -> 11
                    q = New;
                    d = New * 10;
                    first = d % 10; // 5
                    two = d / 10; // 5
                    New_first = first * 10; // 50
                }
                else {
                    first = New % 10; // 5
                    two = New / 10; // 5
                    New_first = first * 10; // 50
                }
                if ((first + two) > 10) {
                    New_two = (first + two) % 10; // 0
                } else {
                    New_two = first + two;
                }
                New = New_first + New_two + (q*10); // 50
                System.out.println(New);
                q = 0;
                cnt++;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
        bw.close();
    }
}
