package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Dash {
    @GsonAdapterKey("separate_av")
    var separateAv: Boolean? = null

    @GsonAdapterKey("streams")
    var streams: List<Stream>? = null

    @GsonAdapterKey("cdns")
    var cdns: Cdns? = null

    @GsonAdapterKey("streams_avc")
    var streamsAvc: List<StreamsAvc>? = null

    @GsonAdapterKey("default_cdn")
    var defaultCdn: String? = null

}