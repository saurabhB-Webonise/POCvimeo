package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Version {
    @GsonAdapterKey("current")
    @Expose
    var current: Any? = null

    @GsonAdapterKey("available")
    @Expose
    var available: Any? = null

}