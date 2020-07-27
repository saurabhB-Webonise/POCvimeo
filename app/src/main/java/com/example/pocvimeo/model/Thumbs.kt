package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Thumbs {
    @GsonAdapterKey("1280")
    @Expose
    private var _1280: String? = null

    @GsonAdapterKey("960")
    @Expose
    private var _960: String? = null

    @GsonAdapterKey("640")
    @Expose
    private var _640: String? = null

    @GsonAdapterKey("base")
    @Expose
    var base: String? = null
    fun get1280(): String? {
        return _1280
    }

    fun set1280(_1280: String?) {
        this._1280 = _1280
    }

    fun get960(): String? {
        return _960
    }

    fun set960(_960: String?) {
        this._960 = _960
    }

    fun get640(): String? {
        return _640
    }

    fun set640(_640: String?) {
        this._640 = _640
    }

}