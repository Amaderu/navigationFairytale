package ru.amaderu.navigationfairytale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FinalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_final, container, false)

        val buttonNext = view.findViewById<Button>(R.id.button)

        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_finalFragment_to_firstFragment)
        }

        return view
    }
}
