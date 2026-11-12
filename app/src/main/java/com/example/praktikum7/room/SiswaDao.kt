package com.example.praktikum7.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)


}