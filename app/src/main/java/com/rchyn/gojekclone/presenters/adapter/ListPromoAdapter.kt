package com.rchyn.gojekclone.presenters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rchyn.gojekclone.databinding.ListPromoBinding
import com.rchyn.gojekclone.domain.model.Promo

class ListPromoAdapter(
    private val dataset: List<Promo>
): RecyclerView.Adapter<ListPromoAdapter.ListPromoViewHolder>() {
    inner class ListPromoViewHolder(
        private val binding: ListPromoBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(promo: Promo){
            binding.apply {
                imgPromo.setImageResource(promo.imgSrc)
                titlePromo.text = itemView.resources.getString(promo.title)
                tvDistance.text = itemView.resources.getString(promo.distance)
                tvRating.text = itemView.resources.getString(promo.rating)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListPromoViewHolder {
        val bindingLayout = ListPromoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListPromoViewHolder(bindingLayout)
    }

    override fun onBindViewHolder(holder: ListPromoViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    override fun getItemCount(): Int = dataset.size
}