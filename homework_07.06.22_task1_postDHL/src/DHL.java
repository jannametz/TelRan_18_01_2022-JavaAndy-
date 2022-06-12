public class DHL implements MailDeliveryService{
    @Override
    public String sendMail() {
        return "Please stamp and send the letter per post DHL.";
    }
}