package com.example.admin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.admin.Repo.model.ProductModel
import com.example.admin.ui.addproductDailog
import com.example.admin.ui.adpater.prouductAdpater
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

class Product_List : Fragment() {


    private lateinit var adapter: prouductAdpater;
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
//
         try {

             val query:Query =
                     FirebaseFirestore.getInstance().collection("Products").orderBy("product_rate", Query.Direction.ASCENDING)


             val options = FirestoreRecyclerOptions.Builder<ProductModel>()
                     .setQuery(query, ProductModel::class.java)
                     .build();
             adapter = prouductAdpater(options)
             recyclerView.adapter = adapter;
             recyclerView.layoutManager = LinearLayoutManager(activity)

         }catch (e : Exception){

             Log.d("fail", "onCreateView: "+e)
         }



        return  view

    }


    private fun openDailogbox() {

        addproductDailog.display(fragmentManager)

    }

    override fun onStart() {
        super.onStart()
        adapter.startListening();
    }



    override fun onStop() {
        super.onStop()
        adapter.stopListening()
    }


}