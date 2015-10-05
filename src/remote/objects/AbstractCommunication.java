package remote.objects;

import remote.interfaces.ComModuleInterface;

/**
 * Created by c10mjn on 2015-10-05.
 */
abstract class AbstractCommunication {

    abstract public void send(AbstractContainer message, ComModuleInterface[] targets);

    abstract public void receive(AbstractContainer message);

}
