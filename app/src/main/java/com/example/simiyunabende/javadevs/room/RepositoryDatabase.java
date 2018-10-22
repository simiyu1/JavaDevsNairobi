package com.example.simiyunabende.javadevs.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = { Repository.class }, version = 1)
public abstract class RepositoryDatabase extends RoomDatabase {

    private static final String DB_NAME = "repositoryDatabase.db";
    private static volatile RepositoryDatabase instance;

    static synchronized RepositoryDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static RepositoryDatabase create(final Context context) {
        return Room.databaseBuilder(
                context,
                RepositoryDatabase.class,
                DB_NAME).build();
    }

    public abstract RepositoryDataAccess getRepoDao();
}
