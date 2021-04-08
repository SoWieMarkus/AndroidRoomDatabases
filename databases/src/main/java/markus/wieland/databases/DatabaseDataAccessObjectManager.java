package markus.wieland.databases;

public interface DatabaseDataAccessObjectManager {

    <E extends DatabaseEntity, D extends BaseDataAccessObject<E>> D getDataAccessObject(Class<D> dClass);

}
