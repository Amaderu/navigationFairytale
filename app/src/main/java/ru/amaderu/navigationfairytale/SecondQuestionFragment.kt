package ru.amaderu.navigationfairytale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondQuestionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_question, container, false)

        val buttonBlack = view.findViewById<Button>(R.id.buttonb)
        val buttonWhite = view.findViewById<Button>(R.id.buttonw)

        buttonBlack.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("flag", "black")

            findNavController().navigate(
                R.id.action_secondQuestionFragment_to_BWoolFragment,
                bundle
            )
        }

        buttonWhite.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("flag", "white")

            findNavController().navigate(
                R.id.action_secondQuestionFragment_to_WWoolFragment,
                bundle
            )
        }

        return view
    }
}