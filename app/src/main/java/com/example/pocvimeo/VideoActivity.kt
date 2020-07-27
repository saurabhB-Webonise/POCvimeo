package com.example.pocvimeo

import android.app.ProgressDialog
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.pocvimeo.model.Data
import com.example.pocvimeo.model.Request
import com.vimeo.networking.VimeoClient
import com.vimeo.networking.callbacks.ModelCallback
import com.vimeo.networking.model.Video
import com.vimeo.networking.model.error.VimeoError
import org.json.JSONObject
import java.util.*
import kotlin.math.log


class VideoActivity : AppCompatActivity() {


    private var URL: String = ""
    private val mApiClient = VimeoClient.getInstance()
    private var mProgressDialog: ProgressDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setMessage("All of your API are belong to us...")

        var video_uri = intent.getStringExtra("VIDEO_ID")
        var video_id = video_uri.split('/')[2]
        URL = "https://player.vimeo.com/video/" + video_id + "/config"
        callApi(URL)
    }


    fun callApi(string: String) {
        mProgressDialog?.show()
        mApiClient.fetchNetworkContent(string, object : ModelCallback<Data>(Data::class.java) {
            override fun success(t: Data) {
                t.request?.files?.progressive?.get(0)?.url?.let {
                    playVideo(it.trim())
                }
            }

            override fun failure(error: VimeoError?) {
                Log.e("TAG", "fail: ")
                mProgressDialog?.hide()
            }
        })

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
        mProgressDialog?.hide()

    }
}