package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Stream {
    @GsonAdapterKey("profile")
    @Expose
    var profile: Int? = null

    @GsonAdapterKey("quality")
    @Expose
    var quality: String? = null

    @GsonAdapterKey("id")
    @Expose
    var id: String? = null

    @GsonAdapterKey("fps")
    @Expose
    var fps: Int? = null

}