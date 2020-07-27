package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Example {
    @GsonAdapterKey("cdn_url")
    @Expose
    var cdnUrl: String? = null

    @GsonAdapterKey("vimeo_api_url")
    @Expose
    var vimeoApiUrl: String? = null

    @GsonAdapterKey("request")
    @Expose
    var request: Request? = null

    @GsonAdapterKey("player_url")
    @Expose
    var playerUrl: String? = null

    @GsonAdapterKey("video")
    @Expose
    var video: Video? = null

    @GsonAdapterKey("user")
    @Expose
    var user: User? = null

    @GsonAdapterKey("embed")
    @Expose
    var embed: Embed? = null

    @GsonAdapterKey("view")
    @Expose
    var view: Int? = null

    @GsonAdapterKey("vimeo_url")
    @Expose
    var vimeoUrl: String? = null

}