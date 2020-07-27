package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class StatsFresnel {
    @GsonAdapterKey("track")
    @Expose
    var track: Boolean? = null

    @GsonAdapterKey("data")
    @Expose
    var data: Data_? = null

    @GsonAdapterKey("group")
    @Expose
    var group: Boolean? = null

}