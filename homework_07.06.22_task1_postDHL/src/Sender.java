public class Sender {
    int yourAuswahl;
    String go_mail;

    public Sender(int yourAuswahl) {
        this.yourAuswahl = yourAuswahl;
    }

    public void send(int yourAuswahl) {
        switch(yourAuswahl){
            case 1:  go_mail = new DHL().sendMail(); break;
            case 2:  go_mail = new email_adress().sendMail(); break;
            case 3:  go_mail = new Pigeon().sendMail(); break;
        }
        System.out.println(go_mail);
    }
}

