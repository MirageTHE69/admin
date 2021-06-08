package com.example.admin.ui.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.admin.R
import com.example.admin.Repo.model.Ordermodel
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class OrderAdpater(options: FirestoreRecyclerOptions<Ordermodel>): FirestoreRecyclerAdapter<Ordermodel, OrderAdpater.ViewHolder>(options) {



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val username = itemView.findViewById<TextView>(R.id.username)
        val price = itemView.findViewById<TextView>(R.id.price)
        val address = itemView.findViewById<TextView>(R.id.address)
        val product = itemView.findViewById<TextView>(R.id.productname)
        val accept = itemView.findViewById<Button>(R.id.accept)
        val decline = itemView.findViewById<Button>(R.id.decline)





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.order_item, parent, false))

    }

    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int,
            model: Ordermodel
    )
    {

    }
}