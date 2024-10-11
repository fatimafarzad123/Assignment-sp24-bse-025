
import java.util.Scanner;
import java.time.LocalDateTime;

public class Messaginapp {
    Message messages[][];
    int messagecount = 0;
    int sendercount = 0;


    {
 messages  =  new Message[4][1];
 System.out.print("\nSEND MESSAGE\n");
    }
    public void sendMessage(String sender, String content ,String reciever){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<messages.length; i++){
            for(int j=0;j<messages[i].length;j++){
            System.out.print("Enter the name of the sender");
            sender = sc.nextLine();
            System.out.println("Enter the message");
            content = sc.nextLine();
            System.out.println("Enter the Status");
            boolean status = sc.nextBoolean();
            if(sc.hasNextLine()){
                sc.nextLine();

            }
                messages[i][j]=new Message (sender, content, reciever,status,messagecount,LocalDateTime.now());
                messagecount++;
                System.out.println("Message sent from " + sender + " to " + reciever);
                break;
            }
        }
    }
    {
        System.out.print("\nMESSAGE (SEEN/UNSEEN)\n");
    }
    public void readMessage(){
        for(int i=0; i<messages.length; i++){
            if (messages[i][0].isStatus()) {
                System.out.println("Message seen: " + messages[i][0]);
            } else {
                System.out.println("Message unseen: " + messages[i][0]);
            }
        }
    }
    {
        System.out.print("\nSEARCH SENDER\n");
    }

public void SearchSndr() {
        String Status=null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the sender");
        String sender=sc.nextLine();


        for(int i=0; i<messages.length; i++){
            for(int j=0; j<messages[i].length; j++){
               String x=messages[i][j].getSender();
                if(sender.equals(x)){


                    Status="Sender found";
                   break;

                }
                else {

                    Status="Sender not found";
                    break;

                }

            }
            if(Status=="Sender found"){

                break;
            }


        }
    System.out.println(Status);
    }
    public void Del() {
        String Status=null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index of message");
        int num=sc.nextInt();


        for(int i=0; i<messages.length; i++){
            for(int j=0; j<messages[i].length; j++){
                int x=messages[i][j].getMessageID();
                if(num==x){


                    messages[i][j].setContent(null);
                    Status="Message deleted";

                    break;

                }
                else {

                    Status="Index not found. No message deleted";
                    break;

                }

            }
            if(Status=="Message deleted"){

                break;
            }


        }
        System.out.println(Status);
        System.out.print("-------------------------------------------------------");
    }
    public void sortMessage() {
        // Bubble sort for 2D array
        for (int i = 0; i < messages.length - 1; i++) {
            for (int j = 0; j < messages[i].length; j++) {
                for (int k = 0; k < messages.length - 1; k++) {
                    for (int l = 0; l < messages[k].length; l++) {
                        // Ensure we don't go out of bounds and both messages are valid
                        if (messages[k + 1] != null && messages[k + 1][l] != null &&
                                messages[k][l] != null &&
                                messages[k + 1][l].getMessageID() > messages[k][l].getMessageID()) {

                            // Swap messages to sort in descending order
                            Message temp = messages[k][l];
                            messages[k][l] = messages[k + 1][l];
                            messages[k + 1][l] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Messages sorted in descending order by MessageID.");
    }


    {

        System.out.print("--------------------------------------------------------");
    }
    public void displayMessages() {
        System.out.println("\nMy CHAT\n");

                for(int i=0; i<messagecount;i++) {
                    for(int j=0; j<messages[i].length; j++) {
                        if (messages[i][j].getContent()!= null||messages[i][j].getContent()==null) {
                            System.out.println("----------------------------------------");
                            System.out.print("  \nMessage:      "  +messages[i][j].getContent());
                            System.out.println("\nsender:   "   +messages[i][j].getSender());
                            System.out.println("\n MessageID:    "    +messages[i][j].getMessageID() );
                            System.out.println("\nStatus:" + messages[i][j].isStatus());
                            System.out.println(" \nTimestamp:   " + messages[i][j].getTimestamp());
                            // System.out.println(messages[i][j].getContent());
                            System.out.println("----------------------------------------");
                            System.out.println(messages[i][j]);



                        }
                        else{
                            System.out.print("Invalid messages");
                        }
                        //System.out.println(messages[i][j]);
                    }
                }

        }

    }






