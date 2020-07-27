package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Sentry {
    @GsonAdapterKey("url")
    @Expose
    var url: String? = null

    @GsonAdapterKey("enabled")
    @Expose
    var enabled: Boolean? = null

    @GsonAdapterKey("debug_enabled")
    @Expose
    var debugEnabled: Boolean? = null

    @GsonAdapterKey("debug_intent")
    @Expose
    var debugIntent: Int? = null

}