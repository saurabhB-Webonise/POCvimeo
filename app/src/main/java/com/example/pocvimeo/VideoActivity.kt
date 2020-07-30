package com.example.pocvimeo

import android.app.ProgressDialog
import android.os.Bundle
import android.util.Log
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.pocvimeo.model.Data
import com.vimeo.networking.VimeoClient
import com.vimeo.networking.callbacks.ModelCallback
import com.vimeo.networking.model.error.VimeoError


class VideoActivity : AppCompatActivity() {


    private val mApiClient = VimeoClient.getInstance()
    private var mProgressDialog: ProgressDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setMessage("Api call in progress..")

        var URL = intent.getStringExtra("URL")
        playVideo(URL)
    }

    //val uri: Uri = Uri.parse(" https://vod-progressive.akamaized.net/exp=1595871681~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F3305%2F17%2F441527014%2F1931891946.mp4~hmac=d38aeadac62f9e201a764e9a36e8ef0af5e97199222a03509296f2da7b866d3b/vimeo-prod-skyfire-std-us/01/3305/17/441527014/1931891946.mp4")

    fun playVideo(url: String) {
        val videoView = findViewById(R.id.videoView1) as VideoView
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.setVideoPath(url)
        videoView.requestFocus()
        videoView.start()
        videoView.stopPlayback()
        mProgressDialog?.hide()

    }
}