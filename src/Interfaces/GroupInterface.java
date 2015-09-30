package Interfaces;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by c10mjn on 2015-09-25.
 */
public interface GroupInterface extends Remote, Serializable{

    String getGroupName();



}
