package remote.interfaces;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by c10mjn on 2015-10-01.
 */
public interface ComModuleInterface extends Remote, Serializable {
    void receiveMessage(String m) throws RemoteException;
}
