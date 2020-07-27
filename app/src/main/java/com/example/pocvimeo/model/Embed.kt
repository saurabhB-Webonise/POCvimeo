package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Embed {
    @GsonAdapterKey("autopause")
    var autopause: Int? = null

    @GsonAdapterKey("playsinline")
    var playsinline: Int? = null

    @GsonAdapterKey("settings")
    var settings: Settings? = null

    @GsonAdapterKey("color")
    var color: String? = null

    @GsonAdapterKey("texttrack")
    var texttrack: String? = null

    @GsonAdapterKey("on_site")
    var onSite: Int? = null

    @GsonAdapterKey("app_id")
    var appId: String? = null

    @GsonAdapterKey("muted")
    var muted: Int? = null

    @GsonAdapterKey("dnt")
    var dnt: Int? = null

    @GsonAdapterKey("player_id")
    var playerId: String? = null

    @GsonAdapterKey("api")
    var api: Any? = null

    @GsonAdapterKey("editor")
    var editor: Boolean? = null

    @GsonAdapterKey("context")
    var context: String? = null

    @GsonAdapterKey("time")
    var time: Int? = null

    @GsonAdapterKey("outro")
    var outro: String? = null

    @GsonAdapterKey("log_plays")
    var logPlays: Int? = null

    @GsonAdapterKey("quality")
    var quality: Any? = null

    @GsonAdapterKey("transparent")
    var transparent: Int? = null

    @GsonAdapterKey("loop")
    var loop: Int? = null

    @GsonAdapterKey("autoplay")
    var autoplay: Int? = null

}