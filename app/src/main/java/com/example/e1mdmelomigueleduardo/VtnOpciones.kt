package com.example.e1mdmelomigueleduardo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.e1mdmelomigueleduardo.databinding.FragmentSecondBinding
import com.example.e1mdmelomigueleduardo.databinding.FragmentBienvenidoBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class VtnOpciones : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private var _binding1: FragmentBienvenidoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val binding1 get() = _binding1!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
        _binding1 = FragmentBienvenidoBinding.inflate(inflater,container, false)
        return binding1.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.volver.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
        binding.logEnter.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_bienvenido)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        _binding1 = null
    }
}