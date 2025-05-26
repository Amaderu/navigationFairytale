package ru.amaderu.navigationfairytale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class WSheepFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_w_sheep, container, false)

        val button = view.findViewById<Button>(R.id.button)

        val flag = arguments?.getString("flag")

        if (flag == "black") {
            button.text = "Далее"
            button.setOnClickListener {
                findNavController().navigate(R.id.action_WSheepFragment_to_secondQuestionFragment)
            }
        } else if (flag == "white") {
            button.text = "А черных?"
            val bundle = Bundle()
            bundle.putString("flag", "white")
            button.setOnClickListener {
                findNavController().navigate(R.id.action_WSheepFragment_to_secondFragment, bundle)
            }

        }

        return view
    }
}