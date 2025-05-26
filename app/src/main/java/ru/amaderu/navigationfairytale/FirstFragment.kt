package ru.amaderu.navigationfairytale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val buttonb: Button = view.findViewById(R.id.buttonb)
        val buttonw: Button = view.findViewById(R.id.buttonw)

        buttonb.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("flag", "black")

            findNavController().navigate(
                R.id.action_firstFragment_to_secondFragment,
                bundle
            )
        }

        buttonw.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("flag", "white")

            findNavController().navigate(
                R.id.action_firstFragment_to_WSheepFragment,
                bundle
            )
        }


        return view
    }
}