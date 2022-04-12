package com.rchyn.gojekclone.presenters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rchyn.gojekclone.databinding.ListNewsBinding
import com.rchyn.gojekclone.domain.model.News

class ListNewsAdapter(
    private val dataSet: List<News>
) : RecyclerView.Adapter<ListNewsAdapter.ListNewsViewHolder>() {

    inner class ListNewsViewHolder(
        private val binding: ListNewsBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(news: News) {
            binding.apply {
                imgNews.setImageResource(news.imgSrc)
                tvTitle.text = itemView.resources.getString(news.title)
                tvDescription.text = itemView.resources.getString(news.description)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListNewsViewHolder {
        val bindingLayout =
            ListNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListNewsViewHolder(bindingLayout)
    }

    override fun onBindViewHolder(holder: ListNewsViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size
}