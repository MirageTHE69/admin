package com.example.admin.ui.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.admin.R
import com.example.admin.Repo.model.OrderstatusModel
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class OrderstatusAdpater(options: FirestoreRecyclerOptions<OrderstatusModel>): FirestoreRecyclerAdapter<OrderstatusModel, OrderstatusAdpater.ViewHolder>(options) {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


        val productname = itemView.findViewById<TextView>(R.id.productname_status)
        val productprice = itemView.findViewById<TextView>(R.id.price_Status)
        val username = itemView.findViewById<TextView>(R.id.username_Status)
        val status = itemView.findViewById<TextView>(R.id.status)
        val address = itemView.findViewById<TextView>(R.id.address_Status)




    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.status_item, parent, false)
        )

    }



    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int,
            model: OrderstatusModel
    ) {
        TODO("Not yet implemented")
    }
}