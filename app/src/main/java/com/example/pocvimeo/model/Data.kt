package com.example.pocvimeo.model

import com.vimeo.stag.GsonAdapterKey

class Data {
    @GsonAdapterKey("cdn_url")
    var cdn_url: String? = null

    @GsonAdapterKey("request")
    var request: Request? = null


    @GsonAdapterKey("vimeo_api_url")
    var vimeo_api_url: String? = null

    @GsonAdapterKey("player_url")
    var player_url: String? = null

    @GsonAdapterKey("video")
    var video: Video? = null


    @GsonAdapterKey("user")
    var user: User? = null


    @GsonAdapterKey("embed")
    var embed: Embed? = null

    @GsonAdapterKey("view")
    var view: Int? = 0

    @GsonAdapterKey("vimeo_url")
    var vimeo_url: String? = null

}