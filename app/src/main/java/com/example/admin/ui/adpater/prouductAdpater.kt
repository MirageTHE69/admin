package com.example.admin.ui.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.admin.R
import com.example.admin.Repo.model.ProductModel
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class prouductAdpater(options: FirestoreRecyclerOptions<ProductModel>): FirestoreRecyclerAdapter<ProductModel, prouductAdpater.ViewHolder>(options) {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val image  = itemView.findViewById<ImageView>(R.id.Product_img)
        val productname = itemView.findViewById<TextView>(R.id.productname)
        val productprice = itemView.findViewById<TextView>(R.id.product_price)
        val editbtn = itemView.findViewById<Button>(R.id.edit_btn)
        val deletebtn = itemView.findViewById<Button>(R.id.delete_btn)

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        )

    }

    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int,
            model: ProductModel
    ) {

//        val url: String? = model.image1;
//        Glide.with(holder.image.context)
//            .load(url)
//            .placeholder(R.drawable.fui_ic_googleg_color_24dp)
//            .into(holder.image)

        holder.productname?.text = model.productname
        holder.productprice.text = model.productprice

    }
}