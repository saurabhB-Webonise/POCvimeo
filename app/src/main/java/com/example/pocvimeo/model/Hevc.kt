package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Hevc {
    @GsonAdapterKey("hdr")
    @Expose
    var hdr: List<Any>? = null

    @GsonAdapterKey("sdr")
    @Expose
    var sdr: List<Any>? = null

}