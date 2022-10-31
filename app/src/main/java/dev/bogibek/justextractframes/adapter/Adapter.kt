package dev.bogibek.justextractframes.adapter

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import dev.bogibek.justextractframes.R

class Adapter(private val list: ArrayList<Bitmap>) : RecyclerView.Adapter<Adapter.VH>() {
    class VH(view: View) : RecyclerView.ViewHolder(view) {
        val frame = view.findViewById<ImageView>(R.id.imageIv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycleview_img_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.frame.setImageBitmap(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}