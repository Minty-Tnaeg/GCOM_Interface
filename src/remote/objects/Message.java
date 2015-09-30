package remote.objects;

import java.io.Serializable;

/**
 * Created by c10mjn on 2015-09-30.
 */
public class Message implements Serializable{
    private String message;

    public Message(String s) {
        this.message = s;
    }

    public String getMessage(){
        return this.message;
    }

}
