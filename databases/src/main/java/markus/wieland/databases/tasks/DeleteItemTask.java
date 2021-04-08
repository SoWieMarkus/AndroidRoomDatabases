package markus.wieland.databases.tasks;

import markus.wieland.databases.BaseDataAccessObject;
import markus.wieland.databases.DatabaseEntity;

public class DeleteItemTask<E extends DatabaseEntity, D extends BaseDataAccessObject<E>> extends DefaultTask<E, D> {

    public DeleteItemTask(D dataAccessObject) {
        super(dataAccessObject);
    }

    @Override
    public final void executeDatabaseTask(E e) {
        dataAccessObject.delete(e);
    }


}
