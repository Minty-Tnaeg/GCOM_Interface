package remote.objects;

import remote.interfaces.ComModuleInterface;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by c10mjn on 2015-09-30.
 */
public class ComModuleImp implements ComModuleInterface {
    String message;
    String nickName;

    public ComModuleImp(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public void receiveMessage(String m) throws RemoteException {
        this.message = new String(m);
        System.err.println("Message received "  + this.message);
    }

    @Override
    public String getNickName() throws RemoteException {
        return nickName;
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
