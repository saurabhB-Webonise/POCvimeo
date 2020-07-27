package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class Urls {
    @GsonAdapterKey("barebone_js")
    @Expose
    var bareboneJs: String? = null

    @GsonAdapterKey("test_imp")
    @Expose
    var testImp: String? = null

    @GsonAdapterKey("js_base")
    @Expose
    var jsBase: String? = null

    @GsonAdapterKey("fresnel")
    @Expose
    var fresnel: String? = null

    @GsonAdapterKey("js")
    @Expose
    var js: String? = null

    @GsonAdapterKey("proxy")
    @Expose
    var proxy: String? = null

    @GsonAdapterKey("mux_url")
    @Expose
    var muxUrl: String? = null

    @GsonAdapterKey("fresnel_mimir_inputs_url")
    @Expose
    var fresnelMimirInputsUrl: String? = null

    @GsonAdapterKey("fresnel_chunk_url")
    @Expose
    var fresnelChunkUrl: String? = null

    @GsonAdapterKey("three_js")
    @Expose
    var threeJs: String? = null

    @GsonAdapterKey("vuid_js")
    @Expose
    var vuidJs: String? = null

    @GsonAdapterKey("fresnel_manifest_url")
    @Expose
    var fresnelManifestUrl: String? = null

    @GsonAdapterKey("chromeless_css")
    @Expose
    var chromelessCss: String? = null

    @GsonAdapterKey("player_telemetry_url")
    @Expose
    var playerTelemetryUrl: String? = null

    @GsonAdapterKey("chromeless_js")
    @Expose
    var chromelessJs: String? = null

    @GsonAdapterKey("css")
    @Expose
    var css: String? = null

}