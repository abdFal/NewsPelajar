package com.example.newspelajar.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newspelajar.R
import com.example.newspelajar.data.model.PostsItem
import com.example.newspelajar.databinding.ActivityDetailNewsBinding
import com.squareup.picasso.Picasso
import java.util.Date

class DetailNewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailNewsBinding

    companion object{
        const val DATA_NEWS = "data_news"
        const val DATE_NEWS = "date_news"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dataNews = intent.getParcelableExtra<PostsItem>(DATA_NEWS)
        val mdate = intent.getStringExtra(DATE_NEWS)
        setUpXml(dataNews, mdate)
    }

    private fun setUpXml(dataNews: PostsItem?, date: String?) {
        binding.apply {
            detailTitle.text =  dataNews?.title
            detailDescription.text =  dataNews?.description
            detailDate.text =  date

            Picasso.get()
                .load(dataNews?.thumbnail)
                .fit()
                .centerInside()
                .into(detailImage)
        }
    }
}