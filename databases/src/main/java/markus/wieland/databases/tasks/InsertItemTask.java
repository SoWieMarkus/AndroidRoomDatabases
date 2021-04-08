package markus.wieland.databases.tasks;

import markus.wieland.databases.BaseDataAccessObject;
import markus.wieland.databases.DatabaseEntity;

public class InsertItemTask <E extends DatabaseEntity, D extends BaseDataAccessObject<E>> extends DefaultTask<E, D> {

    public InsertItemTask(D dataAccessObject) {
        super(dataAccessObject);
    }

    @Override
    public void executeDatabaseTask(E e) {
        dataAccessObject.insert(e);
    }
}
