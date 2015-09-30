package remote.objects;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by c10mjn on 2015-09-30.
 */
public class ComModuleImp implements Remote, Serializable {
    public ComModuleImp() {

    }

    public void receiveMessage(Message m) throws RemoteException{


    }

    public void sendMessage(String m) throws RemoteException{
        //TODO
    }
}
