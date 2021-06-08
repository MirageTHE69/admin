package com.example.admin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.admin.ui.addproductDailog
import com.example.admin.ui.adpater.prouductAdpater

class Product_List : Fragment() {


   // private lateinit var adapter: prouductAdpater;
    lateinit var recyclerView: RecyclerView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product__list, container, false)

        val addproduct : Button = view.findViewById(R.id.Add_product_btn)


        addproduct.setOnClickListener {

            openDailogbox()

        }

        recyclerView = view.findViewById<RecyclerView>(R.id.rcview2)
//        recyclerView.adapter = adapter;
//        recyclerView.layoutManager = LinearLayoutManager(activity)

        return  view


    }


    private fun openDailogbox() {

        addproductDailog.display(fragmentManager)

    }

}