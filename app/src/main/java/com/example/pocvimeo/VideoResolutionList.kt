package com.example.pocvimeo

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pocvimeo.model.Data
import com.example.pocvimeo.model.Progressive
import com.vimeo.networking.VimeoClient
import com.vimeo.networking.callbacks.ModelCallback
import com.vimeo.networking.model.Video
import com.vimeo.networking.model.error.VimeoError

class VideoResolutionList : AppCompatActivity() {

    private var URL: String = ""

    private val TAG: String = VideoResolutionList::class.java.name
    private val mApiClient = VimeoClient.getInstance()
    private var mProgressDialog: ProgressDialog? = null
    private lateinit var rv_videoResolutionList: RecyclerView
    private lateinit var adapterVideoList: AdapterVideoList
    private lateinit var videoList: ArrayList<Video>
    private lateinit var label: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_resolution_list)
        initView()
        init()

    }


    fun initView() {
        rv_videoResolutionList = findViewById(R.id.videoList)
        label = findViewById(R.id.label)
        mProgressDialog = ProgressDialog(this)
        mProgressDialog?.setMessage("Api call in progress..")
    }

    fun init() {
        var video_uri = intent.getStringExtra("VIDEO_ID")
        var video_name = intent.getStringExtra("VIDEO_NAME")
        var urll = intent.getStringExtra("Dummy")
        Log.e(TAG, "onCreate: " + urll)
        label.setText(video_name)
        var video_id = video_uri.split('/')[2]
        URL = "https://player.vimeo.com/video/" + video_id + "/config"
        rv_videoResolutionList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        callApi(URL, video_name)
    }

    fun callApi(string: String, videoName: String) {
        mProgressDialog?.show()
        mApiClient.fetchNetworkContent(string, object : ModelCallback<Data>(Data::class.java) {
            override fun success(t: Data) {

                Log.e(TAG, "success: "+t )
                var list = t.request?.files?.progressive
                setList(list, videoName)
                mProgressDialog?.hide()
            }

            override fun failure(error: VimeoError?) {
                Log.e("TAG", "fail: ")
                mProgressDialog?.hide()
            }
        })
    }

    fun setList(progressiveList: List<Progressive>?, videoName: String) {
        rv_videoResolutionList?.adapter = AdapterVideoResolutionList(progressiveList, object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var obj =p0?.getTag() as Progressive
                gotVideoScreen(obj.url)
            }
        },videoName)
        mProgressDialog?.hide()


        }

    fun gotVideoScreen(string: String?) {
        val intent = Intent(this, VideoActivity::class.java)
        intent.putExtra("URL", string)

        startActivity(intent)
    }
}

