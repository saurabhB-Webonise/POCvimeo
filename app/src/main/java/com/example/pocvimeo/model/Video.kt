package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Video {
    @GsonAdapterKey("version")
    @Expose
    var version: Version? = null

    @GsonAdapterKey("height")
    @Expose
    var height: Int? = null

    @GsonAdapterKey("duration")
    @Expose
    var duration: Int? = null

    @GsonAdapterKey("thumbs")
    @Expose
    var thumbs: Thumbs? = null

    @GsonAdapterKey("owner")
    @Expose
    var owner: Owner? = null

    @GsonAdapterKey("id")
    @Expose
    var id: Int? = null

    @GsonAdapterKey("embed_code")
    @Expose
    var embedCode: String? = null

    @GsonAdapterKey("title")
    @Expose
    var title: String? = null

    @GsonAdapterKey("share_url")
    @Expose
    var shareUrl: String? = null

    @GsonAdapterKey("width")
    @Expose
    var width: Int? = null

    @GsonAdapterKey("embed_permission")
    @Expose
    var embedPermission: String? = null

    @GsonAdapterKey("fps")
    @Expose
    var fps: Double? = null

    @GsonAdapterKey("spatial")
    @Expose
    var spatial: Int? = null

    @GsonAdapterKey("live_event")
    @Expose
    var liveEvent: Any? = null

    @GsonAdapterKey("allow_hd")
    @Expose
    var allowHd: Int? = null

    @GsonAdapterKey("hd")
    @Expose
    var hd: Int? = null

    @GsonAdapterKey("lang")
    @Expose
    var lang: Any? = null

    @GsonAdapterKey("default_to_hd")
    @Expose
    var defaultToHd: Int? = null

    @GsonAdapterKey("url")
    @Expose
    var url: String? = null

    @GsonAdapterKey("privacy")
    @Expose
    var privacy: String? = null

    @GsonAdapterKey("bypass_token")
    @Expose
    var bypassToken: String? = null

    @GsonAdapterKey("unlisted_hash")
    @Expose
    var unlistedHash: Any? = null

}