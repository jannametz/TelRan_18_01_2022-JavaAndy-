import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("How do you want to send a post? Please make a choose: ");
        Sender send = new Sender(1);
        send.send(user.nextInt());
    }

    public static int fehler(int yourAuswahl) {
        if (3 < yourAuswahl || yourAuswahl < 0) {
            System.out.println("Please choose a number between 1 and 3");
            return 0;
        } else return yourAuswahl;
     }
  }
