package com.adri.calculadoraimc;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class user {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    public String username;

    public user(String username) {
        this.username = username;
    }

    public user() {
    }

    public String getUsername() {
        return username;
    }
}



