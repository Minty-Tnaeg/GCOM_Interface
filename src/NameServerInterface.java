

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NameServerInterface extends Remote {

    boolean createGroup(GroupInterface g, ComModuleInterface leader) throws RemoteException;

    ComModuleInterface joinGroup(GroupInterface g, ComModuleInterface m) throws RemoteException;

    GroupInterface[] groupList() throws RemoteException;

}
