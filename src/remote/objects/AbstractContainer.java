package remote.objects;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by c12slm on 2015-10-05.
 */
public abstract class AbstractContainer {
    private AbstractMessage message;

    public AbstractContainer(AbstractMessage message) {
        this.message = message;
    }

    public AbstractMessage getMessage(){
        return this.message;
    }

    abstract public boolean isDeliverable(HashMap<UUID, Integer> vectorClock);

    abstract public boolean isRepeat(HashMap<UUID, Integer> vectorClock);
}
