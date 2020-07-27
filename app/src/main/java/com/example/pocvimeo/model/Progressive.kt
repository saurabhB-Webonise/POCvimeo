package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Progressive {
    @GsonAdapterKey("profile")
    @Expose
    var profile: Int? = null

    @GsonAdapterKey("width")
    @Expose
    var width: Int? = null

    @GsonAdapterKey("mime")
    @Expose
    var mime: String? = null

    @GsonAdapterKey("fps")
    @Expose
    var fps: Int? = null

    @GsonAdapterKey("url")
    @Expose
    var url: String? = null

    @GsonAdapterKey("cdn")
    @Expose
    var cdn: String? = null

    @GsonAdapterKey("quality")
    @Expose
    var quality: String? = null

    @GsonAdapterKey("id")
    @Expose
    var id: String? = null

    @GsonAdapterKey("origin")
    @Expose
    var origin: String? = null

    @GsonAdapterKey("height")
    @Expose
    var height: Int? = null

}