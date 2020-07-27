package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Files {
    @GsonAdapterKey("dash")
    @Expose
    var dash: Dash? = null

    @GsonAdapterKey("hls")
    @Expose
    var hls: Hls? = null

    @GsonAdapterKey("progressive")
    @Expose
    var progressive: List<Progressive>? = null

}