package remote.interfaces;

import remote.objects.ComModuleImp;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NameServerInterface extends Serializable, Remote {

    public void createGroup(String groupName, ComModuleImp leader) throws RemoteException;

    public ComModuleImp joinGroup(String groupName, ComModuleImp m) throws RemoteException;

    public String[] groupList() throws RemoteException;

    public void assignNewLeader(String groupName, ComModuleImp newLeader) throws RemoteException;

}
