package markus.wieland.databases;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public abstract class BaseViewModel<E extends DatabaseEntity, D extends BaseDataAccessObject<E>, R extends BaseRepository<E,D>> extends AndroidViewModel {

    protected final R repository;

    public BaseViewModel(@NonNull Application application) {
        super(application);
        this.repository = initRepository();
    }

    protected abstract R initRepository();

    public R getRepository(){
        return repository;
    }

    public void insert(E e) {
        repository.insert(e);
    }

    public void update(E e) {
        repository.update(e);
    }

    public void delete(E e) {
        repository.delete(e);
    }
}
