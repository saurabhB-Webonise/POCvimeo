package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class AbTests {
    @GsonAdapterKey("chromecast")
    var chromecast: Chromecast? = null

    @GsonAdapterKey("stats_fresnel")
    var statsFresnel: StatsFresnel? = null

}