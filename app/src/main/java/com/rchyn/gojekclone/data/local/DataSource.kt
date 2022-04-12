package com.rchyn.gojekclone.data.local

import com.rchyn.gojekclone.R
import com.rchyn.gojekclone.domain.model.News

object DataSource {
    private val imgNews = intArrayOf(
        R.drawable.img_news_1,
        R.drawable.img_news_2,
        R.drawable.img_news_3,
    )

    private val titleNews = intArrayOf(
        R.string.title_news,
        R.string.title_news,
        R.string.title_news,
    )

    private val descriptionNews = intArrayOf(
        R.string.description_news,
        R.string.description_news,
        R.string.description_news,
    )

    fun getDataNews(): List<News> {
        val data: ArrayList<News> = arrayListOf()
        for (i in imgNews.indices){
            val news = News(
                imgNews[i],
                titleNews[i],
                descriptionNews[i]
            )
            data.add(news)
        }
        return data
    }


}