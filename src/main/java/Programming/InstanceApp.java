package Programming;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();

        // 모든 작업을 할 때마다 파일을 특정해야 하기 때문에 중복되는 부분이 많다.
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
    }
}
