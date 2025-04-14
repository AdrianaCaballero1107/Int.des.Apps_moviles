package com.adri.calculadoraimc;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {user.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    public abstract userDao userDao();
}


