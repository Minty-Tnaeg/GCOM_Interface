package remote.objects;

import remote.interfaces.ComModuleInterface;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by c10mjn on 2015-09-30.
 */
public class ComModuleImp implements ComModuleInterface {
    String message;

    public ComModuleImp() {
        message = "HEJ";
    }

    @Override
    public void receiveMessage(String m) throws RemoteException {
        this.message = new String(m);
        System.err.println("Message received "  + this.message);
    }

    public void sendMessage(String m, ComModuleInterface target) throws IOException {
        try {
            target.receiveMessage(m);
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    public String readMessage() {
        return this.message;
    }
}
