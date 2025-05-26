package ru.amaderu.navigationfairytale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class BWoolFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b_wool, container, false)

        val button = view.findViewById<Button>(R.id.button)

        val flag = arguments?.getString("flag")

        if (flag == "white") {
            button.text = "Далее"
            button.setOnClickListener {
                findNavController().navigate(R.id.action_BWoolFragment_to_thirdQuestionFragment)
            }
        } else if (flag == "black") {
            button.text = "А с белых?"
            val bundle = Bundle()
            bundle.putString("flag", "black")
            button.setOnClickListener {
                findNavController().navigate(R.id.action_BWoolFragment_to_WWoolFragment, bundle)
            }
        }
        return view
    }
}