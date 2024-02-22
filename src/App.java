import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int tipo1 = 0;
        int tipo2 = 0;

        tipo1 = (a * b) + (a-1) * (b-1);
        tipo2 = (a-1) * 2 + (b-1) * 2;
        
        
        System.out.println(tipo1);
        System.out.println(tipo2);
    }
}
