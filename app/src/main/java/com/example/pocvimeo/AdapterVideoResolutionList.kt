package com.example.pocvimeo

import android.service.autofill.OnClickAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.pocvimeo.model.Progressive
import com.vimeo.networking.model.Video
import com.vimeo.networking.model.VideoList
import kotlinx.android.synthetic.main.video_row.view.*

class AdapterVideoResolutionList(
    val progressiveList: List<Progressive>?,
    val onClickListener: View.OnClickListener,
    val videoName: String
) :
    RecyclerView.Adapter<AdapterVideoResolutionList.VideoViewHolder>() {


    var itemClick: ((String) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.video_row2, parent, false)
        return VideoViewHolder(v)
    }

    override fun getItemCount(): Int {
        return progressiveList!!.size
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.bindItems(progressiveList!!.get(position))
        holder.layout1.setTag(progressiveList!!.get(position))
        holder.layout1.setOnClickListener(onClickListener)
        holder.tv_title1.setText(videoName)
    }

    class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout1 = itemView.layout
        val tv_title1 = itemView.findViewById(R.id.tv_title) as TextView

        fun bindItems(p: Progressive) {
            val tv_duration1 = itemView.findViewById(R.id.tv_duration) as TextView
            val tv_quality = itemView.findViewById(R.id.tv_quality) as TextView
            val tv_resolution = itemView.findViewById(R.id.tv_resolution) as TextView
            tv_duration1.setText("")
            tv_quality.setText(p.quality)
            tv_resolution.setText(p.height.toString() + " x " + p.width)

        }
    }
}