package com.adri.calculadoraimc;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface userDao {
    @Insert
    void insert(user user);

    @Query("SELECT * FROM User WHERE username = :username LIMIT 1")
    LiveData<user> findByName(String username);
    @Query("SELECT * FROM User WHERE username = :username LIMIT 1")
    user findByNameNow(String username);

}

