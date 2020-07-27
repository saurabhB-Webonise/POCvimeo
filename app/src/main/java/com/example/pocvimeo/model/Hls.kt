package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Hls {
    @GsonAdapterKey("separate_av")
    @Expose
    var separateAv: Boolean? = null

    @GsonAdapterKey("default_cdn")
    @Expose
    var defaultCdn: String? = null

    @GsonAdapterKey("cdns")
    @Expose
    var cdns: Cdns_? = null

}