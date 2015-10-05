package remote.objects;

import remote.interfaces.ComModuleInterface;

import java.util.ArrayList;

/**
 * Created by c10mjn on 2015-10-05.
 */
public abstract class AbstractCommunication {

    abstract public void send(AbstractContainer message, ArrayList<ComModuleInterface> targets);

    abstract public void receive(AbstractContainer message);

}
