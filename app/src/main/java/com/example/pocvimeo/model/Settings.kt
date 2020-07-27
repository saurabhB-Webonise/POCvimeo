package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Settings {
    @GsonAdapterKey("fullscreen")
    @Expose
    var fullscreen: Int? = null

    @GsonAdapterKey("byline")
    @Expose
    var byline: Int? = null

    @GsonAdapterKey("like")
    @Expose
    var like: Int? = null

    @GsonAdapterKey("playbar")
    @Expose
    var playbar: Int? = null

    @GsonAdapterKey("title")
    @Expose
    var title: Int? = null

    @GsonAdapterKey("color")
    @Expose
    var color: Int? = null

    @GsonAdapterKey("speed")
    @Expose
    var speed: Int? = null

    @GsonAdapterKey("watch_later")
    @Expose
    var watchLater: Int? = null

    @GsonAdapterKey("share")
    @Expose
    var share: Int? = null

    @GsonAdapterKey("scaling")
    @Expose
    var scaling: Int? = null

    @GsonAdapterKey("spatial_compass")
    @Expose
    var spatialCompass: Int? = null

    @GsonAdapterKey("collections")
    @Expose
    var collections: Int? = null

    @GsonAdapterKey("info_on_pause")
    @Expose
    var infoOnPause: Int? = null

    @GsonAdapterKey("portrait")
    @Expose
    var portrait: Int? = null

    @GsonAdapterKey("logo")
    @Expose
    var logo: Int? = null

    @GsonAdapterKey("embed")
    @Expose
    var embed: Int? = null

    @GsonAdapterKey("badge")
    @Expose
    var badge: Int? = null

    @GsonAdapterKey("spatial_label")
    @Expose
    var spatialLabel: Int? = null

    @GsonAdapterKey("volume")
    @Expose
    var volume: Int? = null

}