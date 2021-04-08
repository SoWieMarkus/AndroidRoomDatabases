package markus.wieland.databases;

import java.io.Serializable;

public interface DatabaseEntity extends Serializable {

    long getUniqueId();

}
