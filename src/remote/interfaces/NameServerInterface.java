package remote.interfaces;

import remote.objects.ComModuleImp;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NameServerInterface extends Serializable, Remote {

    public void createGroup(String groupName, ComModuleInterface leader) throws RemoteException;

    public ComModuleInterface joinGroup(String groupName) throws RemoteException;

    public String[] groupList() throws RemoteException;

    public void assignNewLeader(String groupName, ComModuleInterface newLeader) throws RemoteException;

}
