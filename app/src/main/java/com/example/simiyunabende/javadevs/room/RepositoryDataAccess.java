package com.example.simiyunabende.javadevs.room;

import android.arch.persistence.room.Dao;
        import android.arch.persistence.room.Delete;
        import android.arch.persistence.room.Insert;
        import android.arch.persistence.room.Query;
        import android.arch.persistence.room.Update;
        import java.util.List;

@Dao
public interface RepositoryDataAccess {

    @Query("SELECT * FROM repository")
    List<Repository> getAllRepos();

    @Insert
    void insert(Repository... repos);

    @Update
    void update(Repository... repos);

    @Delete
    void delete(Repository... repos);
}
