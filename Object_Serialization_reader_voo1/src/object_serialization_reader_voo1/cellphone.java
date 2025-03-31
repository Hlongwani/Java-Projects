
package object_serialization_reader_voo1;



import java.io.Serializable;

public class cellphone implements Serializable{
    
    private int numberOfMessages;
    
    public cellphone()
    {
        
    }

    public int getNumberOfMessages() {
        return numberOfMessages;
    }

    public void setNumberOfMessages(int numberOfMessages) {
        this.numberOfMessages = numberOfMessages;
    }
    
    
    
    
    
}

