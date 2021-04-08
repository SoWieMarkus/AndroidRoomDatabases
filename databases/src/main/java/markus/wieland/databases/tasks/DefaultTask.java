package markus.wieland.databases.tasks;

import android.os.AsyncTask;

import markus.wieland.databases.BaseDataAccessObject;
import markus.wieland.databases.DatabaseEntity;

public abstract class DefaultTask<E extends DatabaseEntity, D extends BaseDataAccessObject<E>> extends AsyncTask<E, Void, Void> {

    protected final D dataAccessObject;

    public DefaultTask(D dataAccessObject) {
        this.dataAccessObject = dataAccessObject;
    }

    @SafeVarargs
    @Override
    protected final Void doInBackground(E... e) {
        for (E value : e) {
            executeDatabaseTask(value);
        }
        return null;
    }

    public abstract void executeDatabaseTask(E e);


}
