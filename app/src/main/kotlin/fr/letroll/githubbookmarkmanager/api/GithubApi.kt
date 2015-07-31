package fr.letroll.githubbookmarkmanager.api

import android.util.Log
import com.squareup.okhttp.OkHttpClient
import fr.letroll.githubbookmarkmanager.Constant
import fr.letroll.githubbookmarkmanager.api.InterceptingOkClient
import retrofit.RequestInterceptor
import retrofit.RestAdapter

/**
 * Created by letroll on 30/11/14.
 */

public open class GithubApi : Constant() {
    private var user: String = "letroll"
    private var pass: String = "soulriver59"
//    private var token: String = ""

//    public fun setBasicAuth(_user: String, _pass: String) {
//        user = _user
//        pass = _pass
//    }
//
//    public fun setTokenAuth(_token: String) {
//        user = ""
//        pass = ""
//        token = _token
//    }

    public fun getService(): GitHubService {
//        if (getAuthentification() == null) return null

        val restAdapter: RestAdapter = RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setClient(InterceptingOkClient(OkHttpClient()))
                .setRequestInterceptor (getAuthentification())
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build()

//        Log.e("getservice", "token:" + token)

        val service: GitHubService = restAdapter.create(javaClass<GitHubService>())
        return service
    }

    private fun getAuthentification(): RequestInterceptor {
//        if (!user.equals("") && !pass.equals(""))
            return ApiRequestInterceptor(user, pass)
//        else if (!token.equals("")) {
//            Log.e("toto", "utilisation du token:" + token)
//            return ApiRequestInterceptor(token, "")
//        } else return null
    }
}