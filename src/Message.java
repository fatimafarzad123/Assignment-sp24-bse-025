import java.time.LocalDateTime;
public class Message {
    private String sender;
    private String reciever;
    private String content;
    private boolean status;
    private int messageID;
    private LocalDateTime timestamp;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Message(String sender, String content, String reciever, boolean status, int messageID, LocalDateTime timestamp) {
        this.sender = sender;
        this.content = content;
        this.reciever = reciever;
        this.status = status;
        this.messageID = messageID;
        this.timestamp =LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", reciever='" + reciever + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", messageID=" + messageID +
                ", timestamp=" + timestamp +
                '}';
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getReciever() {
        return reciever;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public boolean isStatus() {
        return status;
    }

    public int getMessageID() {
        return messageID;
    }
}
