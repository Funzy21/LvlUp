package com.amadeus.lvlup.feature_dashboard.data
import android.content.Context
import androidx.annotation.Nullable
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao

    companion object {
        @Volatile
        private var Instance : ItemDatabase? = null

        fun getDatabase(context: Context) : ItemDatabase{
            return Instance ?: synchronized(this){
                Room.databaseBuilder(context, ItemDatabase::class.java, "item_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}