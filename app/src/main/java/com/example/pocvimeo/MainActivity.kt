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
        mProgressDialog?.setMessage("All of your API are belong to us...")
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

    fun gotVideoScreen(string: String) {
        val intent = Intent(this, VideoActivity::class.java)
        intent.putExtra("VIDEO_ID", string)
        startActivity(intent)
    }

    fun populateVideoList(videoList: VideoList?) {
        rv_videoList?.adapter = AdapterVideoList(videoList, object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var obj =p0?.getTag() as Video
                gotVideoScreen(obj.uri)
            }
        })
        mProgressDialog?.hide()
    }
}