package com.example.psyhelp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helpnow.R
import com.example.helpnow.databinding.FragmentOneBinding



private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Fragment_one : Fragment(), CustomAdapter.ClickListener {

    lateinit var binding: FragmentOneBinding
    private lateinit var adapter: CustomAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()
        val l = listOf("Депрессия","Паника","Скука","Вопрос психологу")
        for (i in l) {
            data.add(ItemsViewModel(i))
        }
        binding.recyclerview.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(this.context)
            // set the custom adapter to the RecyclerView
            adapter = CustomAdapter(data, this@Fragment_one)
            binding.recyclerview.adapter = adapter
        }

    }

    override fun onItemClick(itemsViewModel: ItemsViewModel) {
        MAIN.navController.navigate(R.id.action_fragment_one_to_fragment_two)
    }



    }