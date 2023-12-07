package com.example.newspelajar.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newspelajar.R
import com.example.newspelajar.data.model.PostsItem
import com.example.newspelajar.databinding.ItemRowNewsBinding
import com.example.newspelajar.ui.detail.DetailNewsActivity
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.Locale

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.MyViewHolder>(){
    private val listNews = ArrayList<PostsItem>()

    fun setData(list: List<PostsItem>?){
        listNews.clear()
        if (list != null){
            listNews.addAll(list)
        }
        notifyItemRangeChanged(0, listNews.size)
    }

    class MyViewHolder(val binding: ItemRowNewsBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(ItemRowNewsBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))


    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = listNews[position]
        val dateTimeString = data.pubDate.toString()
        val dateTimeFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault())
        val date = dateTimeFormat.parse(dateTimeString)
        val myDateFormat = SimpleDateFormat("EEE, dd MMMM | HH:mm", Locale.getDefault())
        val myDate = myDateFormat.format(date!!)

        holder.binding.apply {
            tvTitle.text = data.title
            tvDescription.text = data.description
            tvLink.text = data.link
            tvPubDate.text = myDate

                Picasso.get()
                .load(data.thumbnail).fit().centerInside().placeholder(R.drawable.app_logo)
                .into(imgNews)

        }

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailNewsActivity::class.java)
            intent.putExtra(DetailNewsActivity.DATA_NEWS, data)
            intent.putExtra(DetailNewsActivity.DATE_NEWS, myDate)
            holder.itemView.context.startActivity(intent)
        }
    }


}