import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(countCharacters(""));
    }

    public Test() {
        scanner = null;
    }

    public void write(String x) {

    }

    public String read(File x) {
        String text = ""
        if (x.exists()) {
            Scanner s = new Scanner(x);
        }
        rethr 

    }

    public static int countCharacters(String filename) throws IOException {
        int characterCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        while (reader.ready()) {
            reader.read();
            characterCount++;
        }

        reader.close();

        return characterCount;
    }
}