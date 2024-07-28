package com.amadeus.lvlup.feature_dashboard.data.data_source

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Update
import androidx.room.Ignore
import androidx.room.OnConflictStrategy

@Dao
interface NoteDao {
    @Insert
    suspend fun insert(item: Entity){
    }

    @Delete
    suspend fun delete(item: Entity)

    @Update
    suspend fun update(item: Entity)

    @Ignore
    suspend fun ignore(item: Entity){
        OnConflictStrategy.IGNORE
    }
}