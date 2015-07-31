package fr.letroll.githubbookmarkmanager.api

import android.util.Base64
import fr.letroll.githubbookmarkmanager.data.Storage
import retrofit.RequestInterceptor
import retrofit.RequestInterceptor.RequestFacade

/**
 * Created by jquievreux on 04/12/14.
 */

public open class ApiRequestInterceptor( _user: String, _pass: String) : RequestInterceptor {//_storage: Storage,

    private var user = _user
    private var pass = _pass
//    private var storage = _storage

    public override fun intercept(requestFacade: RequestFacade) {
//        val key: String = storage.getApiKey()
        //ajoute aux header la ApiKey en clé bearer
//        requestFacade.addHeader("bearer", key)

        val authorizationValue = encodeCredentialsForBasicAuthorization()
        requestFacade.addHeader("Authorization", authorizationValue)
        requestFacade.addHeader("Accept", "application/vnd.github.v3+json")
        requestFacade.addHeader("User-Agent", "letroll")
    }
    //token :f80cccecba9ba780da4397285c9e89760021a4c2
    //id:13409598

    private fun encodeCredentialsForBasicAuthorization(): String {
        val userAndPassword = user + ":" + pass
        return "Basic " + Base64.encodeToString(userAndPassword.toByteArray(), Base64.NO_WRAP)
    }
}