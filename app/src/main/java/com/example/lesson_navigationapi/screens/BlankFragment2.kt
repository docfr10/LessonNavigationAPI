package com.example.lesson_navigationapi.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lesson_navigationapi.R
import com.example.lesson_navigationapi.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlank2Binding.inflate(inflater, container, false)
        binding.buttonGotoScreen1.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment2_to_blankFragment1)
        }
        binding.buttonGotoScreen3.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment2_to_blankFragment3)
        }
        return binding.root
    }
}