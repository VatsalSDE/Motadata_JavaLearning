
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptTryWIthReso {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("config.txt");
                BufferedReader br = new BufferedReader(fr)) {

            String line = br.readLine();
            System.out.println(line);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // fr and br are AUTOMATICALLY closed here — no finally needed
        // this is automatically close like the things like the database conections or the network sockets and all like wise 
    }
}
