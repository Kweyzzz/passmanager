package com.example.passmanager.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.passmanager.data.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    // Вставка нового пользователя
    @Insert
    fun insertUser(user: User): Long

    // Получение пользователя по email
    @Query("SELECT * FROM users WHERE email = :email LIMIT 1")
    fun getUserByEmail(email: String): Flow<User?>

    // Получение всех пользователей
    @Query("SELECT * FROM users")
    fun getAllUsers(): LiveData<List<User>>
}
