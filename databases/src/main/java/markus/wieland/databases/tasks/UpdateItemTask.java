package markus.wieland.databases.tasks;

import markus.wieland.databases.BaseDataAccessObject;
import markus.wieland.databases.DatabaseEntity;

public class UpdateItemTask <E extends DatabaseEntity, D extends BaseDataAccessObject<E>> extends DefaultTask<E, D> {

    public UpdateItemTask(D dataAccessObject) {
        super(dataAccessObject);
    }

    @Override
    public void executeDatabaseTask(E e) {
        dataAccessObject.update(e);
    }
}
