package com.example.pocvimeo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vimeo.stag.GsonAdapterKey

class User {
    @GsonAdapterKey("team_origin_user_id")
    @Expose
    var teamOriginUserId: Int? = null

    @GsonAdapterKey("liked")
    @Expose
    var liked: Int? = null

    @GsonAdapterKey("account_type")
    @Expose
    var accountType: String? = null

    @GsonAdapterKey("vimeo_api_client_token")
    @Expose
    var vimeoApiClientToken: Any? = null

    @GsonAdapterKey("vimeo_api_interaction_tokens")
    @Expose
    var vimeoApiInteractionTokens: Any? = null

    @GsonAdapterKey("team_id")
    @Expose
    var teamId: Int? = null

    @GsonAdapterKey("watch_later")
    @Expose
    var watchLater: Int? = null

    @GsonAdapterKey("owner")
    @Expose
    var owner: Int? = null

    @GsonAdapterKey("id")
    @Expose
    var id: Int? = null

    @GsonAdapterKey("mod")
    @Expose
    var mod: Int? = null

    @GsonAdapterKey("logged_in")
    @Expose
    var loggedIn: Int? = null

}