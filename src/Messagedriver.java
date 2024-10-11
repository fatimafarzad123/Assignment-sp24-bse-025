import java.time.LocalDateTime;
public class Messagedriver {
    public static void main(String[] args) {

        Messaginapp app = new Messaginapp();
        app.sendMessage("fatima","hello","raik");
        System.out.println("\nReading messages by status:");
        app.readMessage();
        app.SearchSndr();
        app.Del();
        app.sortMessage();
        app.displayMessages();
    }

}