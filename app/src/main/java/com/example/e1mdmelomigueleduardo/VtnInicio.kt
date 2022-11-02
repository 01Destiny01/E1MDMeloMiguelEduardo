package com.example.e1mdmelomigueleduardo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.*
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBindings
import com.example.e1mdmelomigueleduardo.databinding.InicioxmlBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class VtnInicio : Fragment() {

    private var _binding: InicioxmlBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var nombreusu = ((R.id.usuariotxt) as EditText)

        _binding = InicioxmlBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
// Si pulsas continuar abre el segundo panel
        binding.buttonContinuar.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}