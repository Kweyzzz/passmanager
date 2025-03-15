package com.example.passmanager

import PasswordAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.passmanager.fragments.GenerationFragment
import com.example.passmanager.fragments.HomeFragment
import com.example.passmanager.fragments.pass.passwordList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.homeFragment, HomeFragment())  // Загружаем фрагмент
                .commit()
        }
    }
}
