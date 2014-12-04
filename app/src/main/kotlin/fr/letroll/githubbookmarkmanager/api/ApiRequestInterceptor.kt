package fr.letroll.githubbookmarkmanager.api

import retrofit.RequestInterceptor.RequestFacade
import android.util.Base64
import retrofit.RequestInterceptor

/**
 * Created by jquievreux on 04/12/14.
 */

public open class ApiRequestInterceptor(_user: String, _pass: String) : RequestInterceptor {

    private var user = _user: String
    private var pass = _pass: String

    public override fun intercept(requestFacade: RequestFacade) {
        if (user != null) {
            val authorizationValue = encodeCredentialsForBasicAuthorization():String
            requestFacade.addHeader("Authorization", authorizationValue)
            requestFacade.addHeader("Accept", "application/vnd.github.v3+json")
            requestFacade.addHeader("User-Agent", "letroll")
        }
    }

    private fun encodeCredentialsForBasicAuthorization(): String {
        val userAndPassword = user + ":" + pass:String
        return "Basic " + Base64.encodeToString(userAndPassword.getBytes(), Base64.NO_WRAP)
    }
}