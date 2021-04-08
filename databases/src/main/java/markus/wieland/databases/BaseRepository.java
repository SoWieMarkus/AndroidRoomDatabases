package markus.wieland.databases;

import markus.wieland.databases.tasks.DeleteItemTask;
import markus.wieland.databases.tasks.InsertItemTask;
import markus.wieland.databases.tasks.UpdateItemTask;

public abstract class BaseRepository<E extends DatabaseEntity, D extends BaseDataAccessObject<E>> {

    protected final D dataAccessObject;

    public BaseRepository() {
        this.dataAccessObject = initDataAccessObject();
    }

    public abstract D initDataAccessObject();

    public D getDataAccessObject() {
        return dataAccessObject;
    }

    @SafeVarargs
    public final void insert(E... e) {
        new InsertItemTask<E,D>(dataAccessObject).execute(e);
    }

    @SafeVarargs
    public final void update(E... e) {
        new UpdateItemTask<E,D>(dataAccessObject).execute(e);
    }

    @SafeVarargs
    public final void delete(E... e) {
        new DeleteItemTask<E,D>(dataAccessObject).execute(e);
    }



}
