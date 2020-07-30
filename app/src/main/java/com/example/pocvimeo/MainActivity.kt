package com.example.pocvimeo

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vimeo.networking.VimeoClient
import com.vimeo.networking.callbacks.ModelCallback
import com.vimeo.networking.model.Video
import com.vimeo.networking.model.VideoList
import com.vimeo.networking.model.error.VimeoError

class MainActivity : AppCompatActivity() {
    private val TAG: String = MainActivity::class.java.name
    private val mApiClient = VimeoClient.getInstance()
    private var mProgressDialog: ProgressDialog? = null
    private lateinit var rv_videoList: RecyclerView
    private lateinit var adapterVideoList: AdapterVideoList
    private lateinit var videoList: ArrayList<Video>

    // Created channel on VIMEO , channel ID : 1613655 contain two videos only.
    private val URL: String = "https://api.vimeo.com/channels/1613655/videos"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        init()
    }

    private fun init() {
        rv_videoList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        fetchVideoList()
    }

    fun initView() {
        // ---- Initial UI Setup ----
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setMessage("Api call in progress..")
        rv_videoList = findViewById(R.id.videoList)
    }

    fun fetchVideoList() {
        mProgressDialog?.show()
        mApiClient.fetchNetworkContent(URL,
            object : ModelCallback<VideoList>(VideoList::class.java) {
                override fun success(videoList: VideoList?) {
                    populateVideoList(videoList)
                }

                override fun failure(error: VimeoError?) {
                    mProgressDialog?.hide()
                }
            })
    }

    fun gotVideoScreen(string: String,name:String) {
        val intent = Intent(this, VideoResolutionList::class.java)
        intent.putExtra("VIDEO_ID", string)
        intent.putExtra("VIDEO_NAME",name)
        intent.putExtra("Dummy","https://vod-progressive.akamaized.net/exp=1595871681~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F3305%2F17%2F441527014%2F1931891946.mp4~hmac=d38aeadac62f9e201a764e9a36e8ef0af5e97199222a03509296f2da7b866d3b/vimeo-prod-skyfire-std-us/01/3305/17/441527014/1931891946.mp4")
        startActivity(intent)
    }

    fun populateVideoList(videoList: VideoList?) {
        rv_videoList?.adapter = AdapterVideoList(videoList, object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var obj =p0?.getTag() as Video
                gotVideoScreen(obj.uri,obj.name)
            }
        })
        mProgressDialog?.hide()
    }
}