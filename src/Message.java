/**
 * Message class
 */
public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    /**
     * This method displays on terminal the message created
     */
    public void DisplayMessage(){
        System.out.println(this.message);
    }
}