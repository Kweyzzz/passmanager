package com.example.passmanager.ui.fragments.pass

import android.content.ClipData
import android.content.ClipboardManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.passmanager.R

class PasswordAdapter(private val passwordList: List<Password>) :
    RecyclerView.Adapter<PasswordAdapter.PasswordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasswordViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pass, parent, false)
        return PasswordViewHolder(view)
    }

    override fun onBindViewHolder(holder: PasswordViewHolder, position: Int) {
        val password = passwordList[position]
        // Здесь можно настроить отображение данных, например:
        // holder.nameTextView.text = password.name
        // holder.emailTextView.text = password.emailCompany
    }

    override fun getItemCount(): Int = passwordList.size

    class PasswordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val copyPassword: AppCompatImageButton = itemView.findViewById(R.id.copyPassword)

        init {
            // Устанавливаем обработчик клика для ImageButton
            copyPassword.setOnClickListener {
                // Логика для копирования пароля, например:
                Toast.makeText(itemView.context, "Пароль скопирован!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
