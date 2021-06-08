package com.example.admin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.admin.ui.adpater.OrderstatusAdpater


class Orderstatus : Fragment() {
    // TODO: Rename and change types of parameters

   // private lateinit var adapter: OrderstatusAdpater;
    lateinit var recyclerView: RecyclerView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_orderstatus, container, false)

        val setting = view.findViewById<ImageView>(R.id.setting)

        setting.setOnClickListener {


            view.findNavController().navigate(R.id.action_orderstatus_to_settings)

        }


        recyclerView = view.findViewById<RecyclerView>(R.id.rcview3)

//      recyclerView.adapter = adapter;
//      recyclerView.layoutManager = LinearLayoutManager(activity)

        return  view


    }

}