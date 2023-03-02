package com.example.psyhelp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helpnow.R
import com.example.helpnow.databinding.FragmentTwoBinding



class Fragment_two : Fragment(), CustomAdapter.ClickListener {
    lateinit var binding: FragmentTwoBinding
    private lateinit var adapter: CustomAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(layoutInflater,container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.butBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragment_two_to_fragment_one)
        }

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()
        val l = listOf("Видео", "Текст", "Чат с психологом", "Мои заметки")
        for (i in l) {
            data.add(ItemsViewModel(i))
        }
        binding.recyclerview2.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(this.context)
            // set the custom adapter to the RecyclerView
            adapter = CustomAdapter(data, this@Fragment_two)
            binding.recyclerview2.adapter = adapter
        }
    }



    override fun onItemClick(itemsViewModel: ItemsViewModel) {
        if (itemsViewModel.text == "Мои заметки") {
            MAIN.navController.navigate(R.id.action_fragment_two_to_fragment_my_notes)
        } else {
            MAIN.navController.navigate(R.id.action_fragment_two_to_fragment_three)
        }

    }





}