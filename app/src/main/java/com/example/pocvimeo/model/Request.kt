package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey


class Request {
    @GsonAdapterKey("files")
    var files: Files? = null

    @GsonAdapterKey("lang")
    var lang: String? = null

    @GsonAdapterKey("sentry")
    var sentry: Sentry? = null

    @GsonAdapterKey("ab_tests")
    var abTests: AbTests? = null

    @GsonAdapterKey("referrer")
    var referrer: Any? = null

    @GsonAdapterKey("cookie_domain")
    var cookieDomain: String? = null

    @GsonAdapterKey("timestamp")
    var timestamp: Int? = null

    @GsonAdapterKey("gc_debug")
    var gcDebug: GcDebug? = null

    @GsonAdapterKey("expires")

    var expires: Int? = null

    @GsonAdapterKey("client")

    var client: Client? = null

    @GsonAdapterKey("currency")

    var currency: String? = null

    @GsonAdapterKey("session")

    var session: String? = null

    @GsonAdapterKey("cookie")

    var cookie: Cookie? = null

    @GsonAdapterKey("build")

    var build: Build? = null

    @GsonAdapterKey("urls")

    var urls: Urls? = null

    @GsonAdapterKey("signature")

    var signature: String? = null

    @GsonAdapterKey("flags")

    var flags: Flags? = null

    @GsonAdapterKey("country")

    var country: String? = null

    @GsonAdapterKey("file_codecs")

    var fileCodecs: FileCodecs? = null

}