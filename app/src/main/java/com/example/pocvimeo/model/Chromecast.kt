package com.example.pocvimeo.model

import com.vimeo.stag.GsonAdapterKey

class Chromecast {
    @GsonAdapterKey("track")
    var track: Boolean? = null

    @GsonAdapterKey("data")
    var data: Data? = null

    @GsonAdapterKey("group")
    var group: Boolean? = null

}