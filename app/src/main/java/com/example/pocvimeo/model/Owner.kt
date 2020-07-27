package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Owner {
    @GsonAdapterKey("account_type")
    @Expose
    var accountType: String? = null

    @GsonAdapterKey("name")
    @Expose
    var name: String? = null

    @GsonAdapterKey("img")
    @Expose
    var img: String? = null

    @GsonAdapterKey("url")
    @Expose
    var url: String? = null

    @GsonAdapterKey("img_2x")
    @Expose
    var img2x: String? = null

    @GsonAdapterKey("id")
    @Expose
    var id: Int? = null

}