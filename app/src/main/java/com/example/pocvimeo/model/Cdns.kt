package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Cdns {
    @GsonAdapterKey("fastly_skyfire")
    var fastlySkyfire: FastlySkyfire? = null

}