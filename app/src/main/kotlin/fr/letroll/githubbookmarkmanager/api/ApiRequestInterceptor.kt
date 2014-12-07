package fr.letroll.githubbookmarkmanager.api

import retrofit.RequestInterceptor.RequestFacade
import android.util.Base64
import retrofit.RequestInterceptor
import android.util.Log

/**
 * Created by jquievreux on 04/12/14.
 */

public open class ApiRequestInterceptor(_user: String, _pass: String) : RequestInterceptor {

    private var user = _user: String
    private var pass = _pass: String
    private var token = "": String

    public override fun intercept(requestFacade: RequestFacade) {
        Log.e("toto", "intercept user:" + user + " pass:" + pass + " token:" + token)

        val authorizationValue = encodeCredentialsForBasicAuthorization():String?
        if (authorizationValue != null)
            requestFacade.addHeader("Authorization", authorizationValue)
            requestFacade.addHeader("Accept", "application/vnd.github.v3+json")
            requestFacade.addHeader("User-Agent", "letroll")
    }
    //token :f80cccecba9ba780da4397285c9e89760021a4c2
    //id:13409598

    private fun encodeCredentialsForBasicAuthorization(): String? {
        val userAndPassword = user + ":" + pass:String
        if (userAndPassword.length() > 1)
        return "Basic " + Base64.encodeToString(userAndPassword.getBytes(), Base64.NO_WRAP)
        else if (token.length > 1)
            return "Basic " + token
        else return null
    }
}