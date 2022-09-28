import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String str = "Als Security Engineer, Security Analyst, Chief Security Officer oder als IT-Security Entrepreneur erkennen Sicherheitslücken in Softwaresystemen und können sie beseitigen.";
        String str1 = "Maximilian Percy Metz";
        FileWriter writer = null;
        try {
            writer = new FileWriter("securityIT_MA.txt", true);
            for (int i = 0; i < str.length(); i++) {
                writer.write(str.charAt(i));
            }
            System.out.println("GEMACHT :D ");
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}