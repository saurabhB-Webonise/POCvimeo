package com.example.pocvimeo

import android.service.autofill.OnClickAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.vimeo.networking.model.Video
import com.vimeo.networking.model.VideoList
import kotlinx.android.synthetic.main.video_row.view.*

class AdapterVideoList(val videoList: VideoList?, val onClickListener: View.OnClickListener) :
    RecyclerView.Adapter<AdapterVideoList.VideoViewHolder>() {


    var itemClick: ((String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.video_row, parent, false)
        return VideoViewHolder(v)
    }

    override fun getItemCount(): Int {
        return videoList!!.data.size
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.bindItems(videoList!!.data[position])
        holder.layout1.setTag(videoList!!.data[position])
        holder.layout1.setOnClickListener(onClickListener)

    }

    class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        public val layout1 = itemView.layout

        fun bindItems(video: Video) {
            val tv_title1 = itemView.findViewById(R.id.tv_title) as TextView
            val tv_duration1 = itemView.findViewById(R.id.tv_duration) as TextView
            tv_title1.setText("Title : " + video.name)
            tv_duration1.setText("Duration :" + video.duration.toString())
        }
    }
}