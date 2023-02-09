package com.example.lesson_navigationapi.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.lesson_navigationapi.R
import com.example.lesson_navigationapi.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {
    private lateinit var binding: FragmentBlank3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlank3Binding.inflate(inflater, container, false)
        binding.buttonGotoScreen1.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment1)
        }
        binding.buttonGotoScreen2.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment2)
        }
        // Обработка Back Stack
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_blankFragment3_to_blankFragment1)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)
        return binding.root
    }
}