package Java;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(BoundedLineReader.readLine(bufferedReader, 5_000_000).trim());

        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }

        bufferedReader.close();
    }
}
