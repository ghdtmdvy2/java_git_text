import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = n;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(cnt <= j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            cnt--;
            System.out.println("");
        }

    }
}
