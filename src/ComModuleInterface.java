

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ComModuleInterface extends Remote, Serializable  {

    boolean send(String m) throws RemoteException;

    boolean receive(String m) throws RemoteException;
}
