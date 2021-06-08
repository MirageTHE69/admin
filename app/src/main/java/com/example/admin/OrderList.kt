package com.example.admin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.admin.ui.adpater.OrderAdpater


class OrderList : Fragment() {

  //  lateinit var adapter: OrderAdpater;
    lateinit var recyclerView: RecyclerView;

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_order_list, container, false)
        val view = inflater.inflate(R.layout.fragment_order_list, container, false)

        val setting = view.findViewById<ImageView>(R.id.setting)



        setting.setOnClickListener {

            view.findNavController().navigate(R.id.action_DashBoard_to_settings)

        }


        recyclerView = view.findViewById<RecyclerView>(R.id.rcview)

        return  view

    }
    override fun onStart() {
        super.onStart()
        //adapter.startListening();
    }



    override fun onStop() {
        super.onStop()
        //adapter.stopListening()
    }


}