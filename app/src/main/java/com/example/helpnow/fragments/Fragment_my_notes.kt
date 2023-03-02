package com.example.psyhelp.frags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.helpnow.databinding.FragmentMyNotesBinding
import com.example.helpnow.databinding.FragmentOneBinding


/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_my_notes.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_my_notes : Fragment() {

    lateinit var binding: FragmentMyNotesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMyNotesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}