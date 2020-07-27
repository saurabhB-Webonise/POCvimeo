package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Flags {
    @GsonAdapterKey("dnt")
    @Expose
    var dnt: Int? = null

    @GsonAdapterKey("preload_video")
    @Expose
    var preloadVideo: String? = null

    @GsonAdapterKey("plays")
    @Expose
    var plays: Int? = null

    @GsonAdapterKey("partials")
    @Expose
    var partials: Int? = null

    @GsonAdapterKey("autohide_controls")
    @Expose
    var autohideControls: Int? = null

}