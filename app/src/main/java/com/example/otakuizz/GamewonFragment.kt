package com.example.otakuizz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.otakuizz.databinding.FragmentGameBinding
import com.example.otakuizz.databinding.FragmentGamewonBinding

class GamewonFragment : Fragment() {


    private var _binding : FragmentGamewonBinding? = null
    val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGamewonBinding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_gamewonFragment_to_titleFragment)
        }

        return binding.root
    }

}