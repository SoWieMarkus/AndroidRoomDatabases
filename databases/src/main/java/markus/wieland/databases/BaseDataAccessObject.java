package markus.wieland.databases;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface BaseDataAccessObject<E extends DatabaseEntity> {

    @Insert
    void insert(E item);

    @Update
    void update(E item);

    @Delete
    void delete(E item);


}
