package com.example.otakuizz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.otakuizz.databinding.FragmentGameOverBinding
import com.example.otakuizz.databinding.FragmentGamewonBinding

class GameOverFragment : Fragment() {


    private var _binding : FragmentGameOverBinding? = null
    val binding
        //como quiero que no sea nulo y siempre tenga un valor le añado !!
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

        _binding = FragmentGameOverBinding.inflate(inflater, container, false)

        binding.btnRetry.setOnClickListener {
            findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }

        return binding.root
    }

}