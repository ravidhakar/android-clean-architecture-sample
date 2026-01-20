package com.example.cleanarchitecture.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.cleanarchitecture.data.local.entity.UserEntity
import com.example.cleanarchitecture.data.local.entity.ProductEntity
import com.example.cleanarchitecture.data.local.dao.UserDao
import com.example.cleanarchitecture.data.local.dao.ProductDao

@Database(
    entities = [UserEntity::class, ProductEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun productDao(): ProductDao
}