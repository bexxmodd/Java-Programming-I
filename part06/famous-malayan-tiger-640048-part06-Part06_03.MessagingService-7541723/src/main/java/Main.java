
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message firstSMS = new Message("bexx", "Some jibberish I'm about to send");
        MessagingService geocell = new MessagingService();
        
        geocell.add(firstSMS);
        System.out.println(geocell.getMessages());
        
    }
}
