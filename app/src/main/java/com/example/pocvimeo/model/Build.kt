package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Build {
    @GsonAdapterKey("backend")
    var backend: String? = null

    @GsonAdapterKey("js")
    var js: String? = null

}