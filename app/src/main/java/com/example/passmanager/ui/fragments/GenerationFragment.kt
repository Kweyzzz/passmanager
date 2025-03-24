package com.example.passmanager.ui.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import com.example.passmanager.databinding.FragmentGenerationBinding

class GenerationFragment : Fragment() {

    private lateinit var binding: FragmentGenerationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Используем ViewBinding для удобства
        binding = FragmentGenerationBinding.inflate(inflater, container, false)

        setupListeners()

        return binding.root
    }

    private fun setupListeners() {
        with(binding) {
            // При изменении текста запоминаем, что поле заполнили
            editTextName.doAfterTextChanged {
                if (!it.isNullOrEmpty()) {
                    checkNameGeneration.setColorFilter(Color.parseColor("#1ED760"))
                } else {
                    checkNameGeneration.clearColorFilter()
                }
            }

            editTextEmail.doAfterTextChanged {
                if (!it.isNullOrEmpty()) {
                    checkNameGeneration2.setColorFilter(Color.parseColor("#1ED760"))
                } else {
                    checkNameGeneration2.clearColorFilter()
                }
            }
        }
    }
}
