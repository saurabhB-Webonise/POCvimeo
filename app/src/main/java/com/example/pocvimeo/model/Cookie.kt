package com.example.pocvimeo.model

import com.vimeo.stag.GsonAdapterKey

class Cookie {
    @GsonAdapterKey("scaling")
    var scaling: Int? = null

    @GsonAdapterKey("volume")
    var volume: Double? = null

    @GsonAdapterKey("quality")
    var quality: Any? = null

    @GsonAdapterKey("hd")
    var hd: Int? = null

    @GsonAdapterKey("captions")
    var captions: Any? = null

}