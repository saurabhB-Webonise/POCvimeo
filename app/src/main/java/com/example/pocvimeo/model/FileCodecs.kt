package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class FileCodecs {
    @GsonAdapterKey("hevc")
    @Expose
    var hevc: Hevc? = null

    @GsonAdapterKey("av1")
    @Expose
    var av1: List<Any>? = null

    @GsonAdapterKey("avc")
    @Expose
    var avc: List<String>? = null

}