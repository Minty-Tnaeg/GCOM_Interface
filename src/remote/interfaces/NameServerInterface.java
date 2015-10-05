package remote.interfaces;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NameServerInterface<T extends ComModuleInterface> extends Serializable, Remote {

    T joinGroup(String groupName, T leader) throws RemoteException;

    String[][] groupList() throws RemoteException;

    void assignNewLeader(String groupName, T leader) throws RemoteException;

}
