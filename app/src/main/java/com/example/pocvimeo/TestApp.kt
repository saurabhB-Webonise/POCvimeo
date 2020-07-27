package com.example.pocvimeo

import android.app.Application
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import com.example.pocvimeo.vimeonetworking.NetworkingLogger
import com.vimeo.networking.Configuration
import com.vimeo.networking.Vimeo.LogLevel
import com.vimeo.networking.VimeoClient

/**
 * The application class.
 */
@Suppress("ConstantConditionIf")
class TestApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AccountPreferenceManager.initializeInstance(this)

        // This check is just as for the example. In practice, you'd use one technique or the other.
        val configBuilder =
            if (ACCESS_TOKEN_PROVIDED) accessTokenBuilder
            else clientIdAndClientSecretBuilder

        configBuilder.apply {
            // Disable cert pinning if debugging (so we can intercept packets)
            if (true) {
                enableCertPinning(false)
                setLogLevel(LogLevel.VERBOSE)
            }

            setCacheDirectory(cacheDir)
            setUserAgentString(getUserAgentString(this@TestApp))
            setDebugLogger(NetworkingLogger())
        }

        VimeoClient.initialize(configBuilder.build())
    }

    // The values file is left out of git, so you'll have to provide your own access token
    private val accessTokenBuilder: Configuration.Builder
        get() {
            val accessToken = "267c418e9944d9c83c1e8f6f1ad95a0b"
            return Configuration.Builder(accessToken)
        }

    // The values file is left out of git, so you'll have to provide your own id and secret
    // Used for oauth flow
    private val clientIdAndClientSecretBuilder: Configuration.Builder
        get() {
           // The values file is left out of git, so you'll have to provide your own id and secret
            val clientSecret =
                "8DiLqA7QbRViGP7kfErotE/0vi1AVFDMiNHheNV/qiYUjfTLDAbmv1T+X2mH4dZgiYBW+JkCTztckmjUJZk0R7LxUD7bq51L/f+9mQe7xmQgqGeUbpQF5y5vWE4QZvlx"
            val clientId = "89d8d955ade8a866269bfdff03bb5810a8c145b6"
            val codeGrantRedirectUri = getString(R.string.deeplink_redirect_scheme) + "://" + getString(R.string.deeplink_redirect_host)
            return Configuration.Builder(clientId, clientSecret, SCOPE).apply {
                setCodeGrantRedirectUri(codeGrantRedirectUri)
            }
        }

    companion object {

        private const val SCOPE = "private public create edit delete interact"
        // Switch to true to see how access token auth works.
        private const val ACCESS_TOKEN_PROVIDED = true

        fun getUserAgentString(context: Context): String {
            val packageName = context.packageName
            var version = "unknown"
            try {
                val pInfo = context.packageManager.getPackageInfo(packageName, 0)
                version = pInfo.versionName
            } catch (e: PackageManager.NameNotFoundException) {
                println("Unable to get packageInfo: " + e.message)
            }

            return "$packageName (${Build.MANUFACTURER}, ${Build.MODEL}, ${Build.BRAND}, Android ${Build.VERSION.RELEASE}/${Build.VERSION.SDK_INT} Version $version)"
        }
    }
}
