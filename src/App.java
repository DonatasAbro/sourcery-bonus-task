import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = br.readLine()) != null) {
                boolean prevDigit = false;
                for (int i = 0; i < line.length(); i++) {
                    char lineChar = line.charAt(i);
                    if (lineChar >= '0' && lineChar <= '9') {
                        if (prevDigit) {
                            System.out.println(line);
                            break;
                        } else if (lineChar != '0') {
                            prevDigit = true;
                        }
                    } else {
                        prevDigit = false;
                    }
                }
            }
        }
    }
}
