package com.amadeus.lvlup.feature_dashboard.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Update
import androidx.room.Ignore
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item){
    }

    @Delete
    suspend fun delete(item: Item)

    @Update
    suspend fun update(item: Item)

    @Query("SELECT * FROM items WHERE id = :id")
    fun getItem(id: Int) : Flow<Item>

    @Query("SELECT * FROM items ORDER BY name ASC")
    fun getAllItems() : Flow<List<Item>>
}