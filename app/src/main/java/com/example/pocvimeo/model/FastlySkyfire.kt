package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class FastlySkyfire {
    @GsonAdapterKey("url")
    @Expose
    var url: String? = null

    @GsonAdapterKey("origin")
    @Expose
    var origin: String? = null

    @GsonAdapterKey("avc_url")
    @Expose
    var avcUrl: String? = null

}